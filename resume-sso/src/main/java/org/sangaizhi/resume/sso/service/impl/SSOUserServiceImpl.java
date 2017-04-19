package org.sangaizhi.resume.sso.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.sangaizhi.resume.common.dao.UserDao;
import org.sangaizhi.resume.common.qo.UserQO;
import org.sangaizhi.resume.common.vo.UserVO;
import org.sangaizhi.resume.commons.constant.AccountTypeEnum;
import org.sangaizhi.resume.commons.util.EncryptUtil;
import org.sangaizhi.resume.commons.util.JsonUtils;
import org.sangaizhi.resume.commons.util.UUIDUitl;
import org.sangaizhi.resume.commons.vo.ResumeResult;
import org.sangaizhi.resume.sso.cache.RedisCache;
import org.sangaizhi.resume.sso.service.SSOUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

/**
 * @Description: UserService 实现类
 * @author: sangaizhi
 * @date: 2017-03-28 22:51:09
 */
@Service
public class SSOUserServiceImpl implements SSOUserService
{
    
    @Value("${REDIS_USER_INFO_SESSION_KEY}")
    private String REDIS_USER_INFO_SESSION_KEY;
    
    @Value("${REDIS_USER_INFO_SESSION_EXPIRE}")
    private Long REDIS_USER_INFO_SESSION_EXPIRE;
    
    @Value("${PWD_ENCRYPT_ITERATORS}")
    private Integer PWD_ENCRYPT_ITERATORS;
    
    private RedisCache redisCache = new RedisCache();
    
    @Autowired
    private UserDao userDao;
    
    @Override
    @Transactional(readOnly = true)
    public UserVO getById(Long id)
    {
        if (id == null)
        {
            return null;
        }
        return userDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public UserVO getByCondition(UserQO qo)
    {
        if (qo == null)
        {
            return null;
        }
        return userDao.getByCondition(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryList(UserQO qo)
    {
        if (qo == null)
        {
            return null;
        }
        return userDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(UserQO qo)
    {
        if (qo == null)
        {
            return 0;
        }
        return userDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryPage(UserQO qo)
    {
        if (qo == null)
        {
            return null;
        }
        return userDao.queryPage(qo);
    }
    
    @Override
    public int save(UserVO vo)
    {
        if (vo == null)
        {
            return 0;
        }
        return userDao.save(vo);
    }
    
    @Override
    public int saveBatch(List<UserVO> voList)
    {
        if (CollectionUtils.isEmpty(voList))
        {
            return 0;
        }
        for (UserVO vo : voList)
        {
            vo.setPassword(DigestUtils.md5DigestAsHex(vo.getPassword().getBytes()));
            vo.setCreateTime(new Date());
            vo.setUpdateTime(new Date());
        }
        return userDao.saveBatch(voList);
    }
    
    @Override
    public int updateById(UserVO vo)
    {
        if (vo == null)
        {
            return 0;
        }
        return userDao.updateById(vo);
    }
    
    @Override
    public int deleteById(Long id)
    {
        if (id == null)
        {
            return 0;
        }
        return userDao.deleteById(id);
    }
    
    @Override
    public int deleteBatchByIds(List<Long> ids)
    {
        if (CollectionUtils.isEmpty(ids))
        {
            return 0;
        }
        return userDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public UserVO getDetailById(Long id)
    {
        if (id == null)
        {
            return null;
        }
        return userDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public UserVO getDetailByCondition(UserQO qo)
    {
        if (qo == null)
        {
            return null;
        }
        return userDao.getDetailByCondition(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryDetailList(UserQO qo)
    {
        if (qo == null)
        {
            return null;
        }
        return userDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(UserQO qo)
    {
        if (qo == null)
        {
            return 0;
        }
        return userDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryDetailPage(UserQO qo)
    {
        if (qo == null)
        {
            return null;
        }
        return userDao.queryDetailPage(qo);
    }
    
    @Override
    public ResumeResult checkUserData(String param, Short type)
    {
        UserQO userQO = new UserQO();
        if (Objects.equals(type, AccountTypeEnum.EMAIL.getValue()))
        {
            userQO.setEmail(param);
        }
        else if (Objects.equals(type, AccountTypeEnum.NAME.getValue()))
        {
            userQO.setName(param);
        }
        else if (Objects.equals(type, AccountTypeEnum.PHONE.getValue()))
        {
            userQO.setPhone(param);
        }
        List<UserVO> list = this.queryList(userQO);
        if (CollectionUtils.isEmpty(list))
        {
            return ResumeResult.build(true,"");
        }
        return ResumeResult.build(false, "");
    }
    
    @Override
    public ResumeResult userLogin(String username, String password, Short userAccountType)
    {
        if (null == userAccountType)
        {
            userAccountType = AccountTypeEnum.NAME.getValue();
        }
        UserQO userQO = new UserQO();
        if (Objects.equals(userAccountType, AccountTypeEnum.NAME.getLabel()))
        {
            userQO.setName(username);
        }
        else if (Objects.equals(userAccountType, AccountTypeEnum.PHONE.getLabel()))
        {
            userQO.setPhone(username);
        }
        else if (Objects.equals(userAccountType, AccountTypeEnum.EMAIL.getLabel()))
        {
            userQO.setEmail(username);
        }
        userQO.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
        List<UserVO> list = this.queryList(userQO);
        if (CollectionUtils.isEmpty(list))
        {
            return ResumeResult.build(false, "用户名或密码错误");
        }
        UserVO user = list.get(0);
        // TODO 应考虑用户重复登录的情况，避免遭受恶意登录造成redis缓存无效用户数据
        // 生成 token
        String token = UUID.randomUUID().toString();
        user.setPassword(null);
        redisCache.putCacheWithExpireTime(REDIS_USER_INFO_SESSION_KEY + ":" + token,
            JsonUtils.objectToJson(user),
            REDIS_USER_INFO_SESSION_EXPIRE);
        return ResumeResult.ok(token);
    }
    
    @Override
    public ResumeResult getUserByToken(String token)
    {
        String userInfoJson = redisCache.getCache(REDIS_USER_INFO_SESSION_KEY + ":" + token, String.class);
        if (StringUtils.isBlank(userInfoJson))
        {
            return ResumeResult.build(false, "用户登录已过期，请重新登录");
        }
        // 更新过期时间
        redisCache.putCacheWithExpireTime(REDIS_USER_INFO_SESSION_KEY + ":" + token,
            userInfoJson,
            REDIS_USER_INFO_SESSION_EXPIRE);
        return ResumeResult.ok(JsonUtils.jsonToPojo(userInfoJson, UserVO.class));
    }
    
    @Override
    public ResumeResult userLogout(String token)
    {
        redisCache.deleteCache(REDIS_USER_INFO_SESSION_KEY + ":" + token);
        return ResumeResult.ok();
    }
    
    @Override
    public ResumeResult register(String name, String phone, String password)
    {
        ResumeResult resumeResult = this.checkUserData(name, AccountTypeEnum.NAME.getValue());
        if (!resumeResult.getStatus())
        {
            resumeResult.setMsg("用户名已被占用");
            return resumeResult;
        }
        resumeResult = this.checkUserData(phone, AccountTypeEnum.PHONE.getValue());
        if (!resumeResult.getStatus())
        {
            resumeResult.setMsg("手机号已被占用");
            return resumeResult;
        }
        String salt = UUIDUitl.generatePwdStr();
        password = EncryptUtil.md5Hex(password + salt, PWD_ENCRYPT_ITERATORS);
        UserVO userVO = new UserVO();
        userVO.setName(name);
        userVO.setPhone(phone);
        userVO.setSalt(salt);
        userVO.setPassword(password);
        userVO.setCreateTime(new Date());
        this.save(userVO);
        return ResumeResult.ok();
    }
}

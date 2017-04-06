package org.sangaizhi.resume.common.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sangaizhi.resume.common.qo.UserQO;
import org.sangaizhi.resume.common.vo.UserVO;
import org.sangaizhi.resume.common.service.UserService;
import org.sangaizhi.resume.common.dao.UserDao;

/**
 * @Description: UserService 实现类
 * @author: saz
 * @date: 2017-04-06 16:06:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public UserVO getById(Long id) {
        if (id == null) {
            return null;
        }
        return userDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public UserVO getByCondition(UserQO qo) {
        if (qo == null) {
            return null;
        }
        return userDao.getByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryList(UserQO qo) {
        if (qo == null) {
            return null;
        }
        return userDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(UserQO qo) {
        if (qo == null) {
            return 0;
        }
        return userDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryPage(UserQO qo) {
        if (qo == null) {
            return null;
        }
        return userDao.queryPage(qo); 
    }

    @Override
    public int save(UserVO vo) {
        if (vo == null) {
            return 0;
        }
        return userDao.save(vo);
    }

    @Override
    public int saveBatch(List<UserVO> voList) {
        if (CollectionUtils.isEmpty(voList)) {
            return 0;
        }
        return userDao.saveBatch(voList);
    }

    @Override
    public int updateById(UserVO vo) {
        if (vo == null) {
            return 0;
        }
        return userDao.updateById(vo);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return userDao.deleteById(id);
    }

    @Override
    public int deleteBatchByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return userDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public UserVO getDetailById(Long id) {
        if (id == null) {
            return null;
        }
        return userDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public UserVO getDetailByCondition(UserQO qo) {
        if (qo == null) {
            return null;
        }
        return userDao.getDetailByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryDetailList(UserQO qo) {
        if (qo == null) {
            return null;
        }
        return userDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(UserQO qo) {
        if (qo == null) {
            return 0;
        }
        return userDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<UserVO> queryDetailPage(UserQO qo) {
        if (qo == null) {
            return null;
        }
        return userDao.queryDetailPage(qo); 
    }
}

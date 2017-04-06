package org.sangaizhi.resume.common.service;

import java.util.List;

import org.sangaizhi.resume.common.vo.UserVO;
import org.sangaizhi.resume.common.qo.UserQO;

/**
 * @Description: UserService
 * @author: saz
 * @date: 2017-04-06 16:06:28
 */
public interface UserService {
    /**
     * 根据Id查询对象信息。单表查询，无连表操作
     * @param id 对象Id
     * @return UserVO 对象信息
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    UserVO getById(Long id);

    /**
     * 根据条件查询对象信息。单表查询，无连表操作
     * @param qo UserQO查询对象
     * @return UserVO 对象信息
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    UserVO getByCondition(UserQO qo);
    
    /**
     * 根据条件查询对象列表。单表查询，无连表操作
     * 
     * @param qo UserQO查询对象
     * @return List<UserVO> UserVO对象列表
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    List<UserVO> queryList(UserQO qo);
    
    /**
     * 根据条件统计。单表查询，无连表操作
     * @param qo UserQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    long count(UserQO qo);
    
    /**
     * 根据条件分页查询对象列表。单表查询，无连表操作
     * 
     * @param qo UserQO查询对象
     * @return List<UserVO> UserVO对象列表
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    List<UserVO> queryPage(UserQO qo);

    /**
     * 保存对象信息
     * 
     * @param vo UserVO对象信息
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    int save(UserVO vo);

    /**
     * 批量保存对象信息
     * 
     * @param voList UserVO对象列表
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    int saveBatch(List<UserVO> voList);

    /**
     * 根据Id修改对象信息
     * 
     * @param vo UserVO对象
     * @return int 修改成功的记录条数
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    int updateById(UserVO vo);
    
    /**
     * 根据Id删除对象信息
     * 
     * @param id UserVO对象Id
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    int deleteById(Long id);

    /**
     * 根据Id批量删除对象信息
     * 
     * @param ids UserVO对象Id集合
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    int deleteBatchByIds(List<Long> ids);
    
    /**
     * 根据Id查询对象信息。多表连表查询
     * @param id 对象Id
     * @return UserVO 对象信息
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    UserVO getDetailById(Long id);

    /**
     * 根据条件查询对象信息。多表连表查询
     * @param qo UserQO查询对象
     * @return UserVO 对象信息
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    UserVO getDetailByCondition(UserQO qo);
    
    /**
     * 根据条件查询对象列表。多表连表查询
     * 
     * @param qo UserQO查询对象
     * @return List<UserVO> UserVO对象列表
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    List<UserVO> queryDetailList(UserQO qo);
    
    /**
     * 根据条件统计。多表连表查询
     * @param qo UserQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    long countDetail(UserQO qo);
    
    /**
     * 根据条件分页查询对象列表。多表连表查询
     * 
     * @param qo UserQO查询对象
     * @return List<UserVO> UserVO对象列表
     * @author: saz
     * @date: 2017-04-06 16:06:28
     */
    List<UserVO> queryDetailPage(UserQO qo);
}

package org.sangaizhi.resume.common.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.sangaizhi.resume.common.qo.WorksCategoryQO;
import org.sangaizhi.resume.common.vo.WorksCategoryVO;

/**
 * @Description: WorksCategoryDao
 * @author: saz
 * @date: 2017-04-06 10:13:18
 */
@Repository
public interface WorksCategoryDao {
    /**
     * 根据Id查询对象信息。单表查询，无连表操作
     * @param id 对象Id
     * @return WorksCategoryVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    WorksCategoryVO getById(Long id);

    /**
     * 根据条件查询对象信息。单表查询，无连表操作
     * @param qo WorksCategoryQO查询对象
     * @return WorksCategoryVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    WorksCategoryVO getByCondition(WorksCategoryQO qo);
    
    /**
     * 根据条件统计。单表查询，无连表操作
     * @param qo WorksCategoryQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    long count(WorksCategoryQO qo);

    /**
     * 根据条件查询对象列表。单表查询，无连表操作
     * 
     * @param qo WorksCategoryQO查询对象
     * @return List<WorksCategoryVO> WorksCategoryVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    List<WorksCategoryVO> queryList(WorksCategoryQO qo);
    
    /**
     * 根据条件分页查询对象列表。单表查询，无连表操作
     * 
     * @param qo WorksCategoryQO查询对象
     * @return List<WorksCategoryVO> WorksCategoryVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    List<WorksCategoryVO> queryPage(WorksCategoryQO qo);

    /**
     * 保存对象信息
     * 
     * @param vo WorksCategoryVO对象信息
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    int save(WorksCategoryVO vo);

    /**
     * 批量保存对象信息
     * 
     * @param voList WorksCategoryVO对象列表
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    int saveBatch(List<WorksCategoryVO> voList);

    /**
     * 根据Id修改对象信息
     * 
     * @param vo WorksCategoryVO对象
     * @return int 修改成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    int updateById(WorksCategoryVO vo);
    
    /**
     * 根据Id删除对象信息
     * 
     * @param id WorksCategoryVO对象Id
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    int deleteById(Long id);

    /**
     * 根据Id批量删除对象信息
     * 
     * @param ids WorksCategoryVO对象Id集合
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    int deleteBatchByIds(List<Long> ids);
    
    /**
     * 根据Id查询对象信息。多表连表查询
     * @param id 对象Id
     * @return WorksCategoryVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    WorksCategoryVO getDetailById(Long id);

    /**
     * 根据条件查询对象信息。多表连表查询
     * @param qo WorksCategoryQO查询对象
     * @return WorksCategoryVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    WorksCategoryVO getDetailByCondition(WorksCategoryQO qo);
    
    /**
     * 根据条件查询对象列表。多表连表查询
     * 
     * @param qo WorksCategoryQO查询对象
     * @return List<WorksCategoryVO> WorksCategoryVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    List<WorksCategoryVO> queryDetailList(WorksCategoryQO qo);
    
    /**
     * 根据条件统计。多表连表查询
     * @param qo WorksCategoryQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    long countDetail(WorksCategoryQO qo);
    
    /**
     * 根据条件分页查询对象列表。多表连表查询
     * 
     * @param qo WorksCategoryQO查询对象
     * @return List<WorksCategoryVO> WorksCategoryVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:13:18
     */
    List<WorksCategoryVO> queryDetailPage(WorksCategoryQO qo);
}

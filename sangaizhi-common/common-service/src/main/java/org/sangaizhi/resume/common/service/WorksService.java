package org.sangaizhi.resume.common.service;

import java.util.List;

import org.sangaizhi.resume.common.qo.WorksQO;
import org.sangaizhi.resume.common.vo.WorksVO;

/**
 * @Description: WorksService
 * @author: saz
 * @date: 2017-04-06 10:11:24
 */
public interface WorksService {
    /**
     * 根据Id查询对象信息。单表查询，无连表操作
     * @param id 对象Id
     * @return WorksVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    WorksVO getById(Long id);

    /**
     * 根据条件查询对象信息。单表查询，无连表操作
     * @param qo WorksQO查询对象
     * @return WorksVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    WorksVO getByCondition(WorksQO qo);
    
    /**
     * 根据条件查询对象列表。单表查询，无连表操作
     * 
     * @param qo WorksQO查询对象
     * @return List<WorksVO> WorksVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    List<WorksVO> queryList(WorksQO qo);
    
    /**
     * 根据条件统计。单表查询，无连表操作
     * @param qo WorksQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    long count(WorksQO qo);
    
    /**
     * 根据条件分页查询对象列表。单表查询，无连表操作
     * 
     * @param qo WorksQO查询对象
     * @return List<WorksVO> WorksVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    List<WorksVO> queryPage(WorksQO qo);

    /**
     * 保存对象信息
     * 
     * @param vo WorksVO对象信息
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    int save(WorksVO vo);

    /**
     * 批量保存对象信息
     * 
     * @param voList WorksVO对象列表
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    int saveBatch(List<WorksVO> voList);

    /**
     * 根据Id修改对象信息
     * 
     * @param vo WorksVO对象
     * @return int 修改成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    int updateById(WorksVO vo);
    
    /**
     * 根据Id删除对象信息
     * 
     * @param id WorksVO对象Id
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    int deleteById(Long id);

    /**
     * 根据Id批量删除对象信息
     * 
     * @param ids WorksVO对象Id集合
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    int deleteBatchByIds(List<Long> ids);
    
    /**
     * 根据Id查询对象信息。多表连表查询
     * @param id 对象Id
     * @return WorksVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    WorksVO getDetailById(Long id);

    /**
     * 根据条件查询对象信息。多表连表查询
     * @param qo WorksQO查询对象
     * @return WorksVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    WorksVO getDetailByCondition(WorksQO qo);
    
    /**
     * 根据条件查询对象列表。多表连表查询
     * 
     * @param qo WorksQO查询对象
     * @return List<WorksVO> WorksVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    List<WorksVO> queryDetailList(WorksQO qo);
    
    /**
     * 根据条件统计。多表连表查询
     * @param qo WorksQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    long countDetail(WorksQO qo);
    
    /**
     * 根据条件分页查询对象列表。多表连表查询
     * 
     * @param qo WorksQO查询对象
     * @return List<WorksVO> WorksVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:11:24
     */
    List<WorksVO> queryDetailPage(WorksQO qo);
}

package org.sangaizhi.resume.common.service;

import java.util.List;

import org.sangaizhi.resume.common.qo.ProjectQO;
import org.sangaizhi.resume.common.vo.ProjectVO;

/**
 * @Description: ProjectService
 * @author: saz
 * @date: 2017-04-06 10:01:01
 */
public interface ProjectService {
    /**
     * 根据Id查询对象信息。单表查询，无连表操作
     * @param id 对象Id
     * @return ProjectVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    ProjectVO getById(Long id);

    /**
     * 根据条件查询对象信息。单表查询，无连表操作
     * @param qo ProjectQO查询对象
     * @return ProjectVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    ProjectVO getByCondition(ProjectQO qo);
    
    /**
     * 根据条件查询对象列表。单表查询，无连表操作
     * 
     * @param qo ProjectQO查询对象
     * @return List<ProjectVO> ProjectVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    List<ProjectVO> queryList(ProjectQO qo);
    
    /**
     * 根据条件统计。单表查询，无连表操作
     * @param qo ProjectQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    long count(ProjectQO qo);
    
    /**
     * 根据条件分页查询对象列表。单表查询，无连表操作
     * 
     * @param qo ProjectQO查询对象
     * @return List<ProjectVO> ProjectVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    List<ProjectVO> queryPage(ProjectQO qo);

    /**
     * 保存对象信息
     * 
     * @param vo ProjectVO对象信息
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    int save(ProjectVO vo);

    /**
     * 批量保存对象信息
     * 
     * @param voList ProjectVO对象列表
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    int saveBatch(List<ProjectVO> voList);

    /**
     * 根据Id修改对象信息
     * 
     * @param vo ProjectVO对象
     * @return int 修改成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    int updateById(ProjectVO vo);
    
    /**
     * 根据Id删除对象信息
     * 
     * @param id ProjectVO对象Id
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    int deleteById(Long id);

    /**
     * 根据Id批量删除对象信息
     * 
     * @param ids ProjectVO对象Id集合
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    int deleteBatchByIds(List<Long> ids);
    
    /**
     * 根据Id查询对象信息。多表连表查询
     * @param id 对象Id
     * @return ProjectVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    ProjectVO getDetailById(Long id);

    /**
     * 根据条件查询对象信息。多表连表查询
     * @param qo ProjectQO查询对象
     * @return ProjectVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    ProjectVO getDetailByCondition(ProjectQO qo);
    
    /**
     * 根据条件查询对象列表。多表连表查询
     * 
     * @param qo ProjectQO查询对象
     * @return List<ProjectVO> ProjectVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    List<ProjectVO> queryDetailList(ProjectQO qo);
    
    /**
     * 根据条件统计。多表连表查询
     * @param qo ProjectQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    long countDetail(ProjectQO qo);
    
    /**
     * 根据条件分页查询对象列表。多表连表查询
     * 
     * @param qo ProjectQO查询对象
     * @return List<ProjectVO> ProjectVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:01:01
     */
    List<ProjectVO> queryDetailPage(ProjectQO qo);
}

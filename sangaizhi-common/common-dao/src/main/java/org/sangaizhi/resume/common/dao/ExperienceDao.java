package org.sangaizhi.resume.common.dao;

import java.util.List;

import org.sangaizhi.resume.common.qo.ExperienceQO;
import org.springframework.stereotype.Repository;
import org.sangaizhi.resume.common.vo.ExperienceVO;

/**
 * @Description: ExperienceDao
 * @author: saz
 * @date: 2017-04-06 09:52:59
 */
@Repository
public interface ExperienceDao {
    /**
     * 根据Id查询对象信息。单表查询，无连表操作
     * @param id 对象Id
     * @return ExperienceVO 对象信息
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    ExperienceVO getById(Long id);

    /**
     * 根据条件查询对象信息。单表查询，无连表操作
     * @param qo ExperienceQO查询对象
     * @return ExperienceVO 对象信息
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    ExperienceVO getByCondition(ExperienceQO qo);
    
    /**
     * 根据条件统计。单表查询，无连表操作
     * @param qo ExperienceQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    long count(ExperienceQO qo);

    /**
     * 根据条件查询对象列表。单表查询，无连表操作
     * 
     * @param qo ExperienceQO查询对象
     * @return List<ExperienceVO> ExperienceVO对象列表
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    List<ExperienceVO> queryList(ExperienceQO qo);
    
    /**
     * 根据条件分页查询对象列表。单表查询，无连表操作
     * 
     * @param qo ExperienceQO查询对象
     * @return List<ExperienceVO> ExperienceVO对象列表
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    List<ExperienceVO> queryPage(ExperienceQO qo);

    /**
     * 保存对象信息
     * 
     * @param vo ExperienceVO对象信息
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    int save(ExperienceVO vo);

    /**
     * 批量保存对象信息
     * 
     * @param voList ExperienceVO对象列表
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    int saveBatch(List<ExperienceVO> voList);

    /**
     * 根据Id修改对象信息
     * 
     * @param vo ExperienceVO对象
     * @return int 修改成功的记录条数
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    int updateById(ExperienceVO vo);
    
    /**
     * 根据Id删除对象信息
     * 
     * @param id ExperienceVO对象Id
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    int deleteById(Long id);

    /**
     * 根据Id批量删除对象信息
     * 
     * @param ids ExperienceVO对象Id集合
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    int deleteBatchByIds(List<Long> ids);
    
    /**
     * 根据Id查询对象信息。多表连表查询
     * @param id 对象Id
     * @return ExperienceVO 对象信息
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    ExperienceVO getDetailById(Long id);

    /**
     * 根据条件查询对象信息。多表连表查询
     * @param qo ExperienceQO查询对象
     * @return ExperienceVO 对象信息
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    ExperienceVO getDetailByCondition(ExperienceQO qo);
    
    /**
     * 根据条件查询对象列表。多表连表查询
     * 
     * @param qo ExperienceQO查询对象
     * @return List<ExperienceVO> ExperienceVO对象列表
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    List<ExperienceVO> queryDetailList(ExperienceQO qo);
    
    /**
     * 根据条件统计。多表连表查询
     * @param qo ExperienceQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    long countDetail(ExperienceQO qo);
    
    /**
     * 根据条件分页查询对象列表。多表连表查询
     * 
     * @param qo ExperienceQO查询对象
     * @return List<ExperienceVO> ExperienceVO对象列表
     * @author: saz
     * @date: 2017-04-06 09:52:59
     */
    List<ExperienceVO> queryDetailPage(ExperienceQO qo);
}

package org.sangaizhi.resume.common.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.sangaizhi.resume.common.qo.SkillQO;
import org.sangaizhi.resume.common.vo.SkillVO;

/**
 * @Description: SkillDao
 * @author: saz
 * @date: 2017-04-06 10:08:21
 */
@Repository
public interface SkillDao {
    /**
     * 根据Id查询对象信息。单表查询，无连表操作
     * @param id 对象Id
     * @return SkillVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    SkillVO getById(Long id);

    /**
     * 根据条件查询对象信息。单表查询，无连表操作
     * @param qo SkillQO查询对象
     * @return SkillVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    SkillVO getByCondition(SkillQO qo);
    
    /**
     * 根据条件统计。单表查询，无连表操作
     * @param qo SkillQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    long count(SkillQO qo);

    /**
     * 根据条件查询对象列表。单表查询，无连表操作
     * 
     * @param qo SkillQO查询对象
     * @return List<SkillVO> SkillVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    List<SkillVO> queryList(SkillQO qo);
    
    /**
     * 根据条件分页查询对象列表。单表查询，无连表操作
     * 
     * @param qo SkillQO查询对象
     * @return List<SkillVO> SkillVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    List<SkillVO> queryPage(SkillQO qo);

    /**
     * 保存对象信息
     * 
     * @param vo SkillVO对象信息
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    int save(SkillVO vo);

    /**
     * 批量保存对象信息
     * 
     * @param voList SkillVO对象列表
     * @return int 保存成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    int saveBatch(List<SkillVO> voList);

    /**
     * 根据Id修改对象信息
     * 
     * @param vo SkillVO对象
     * @return int 修改成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    int updateById(SkillVO vo);
    
    /**
     * 根据Id删除对象信息
     * 
     * @param id SkillVO对象Id
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    int deleteById(Long id);

    /**
     * 根据Id批量删除对象信息
     * 
     * @param ids SkillVO对象Id集合
     * @return int 删除成功的记录条数
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    int deleteBatchByIds(List<Long> ids);
    
    /**
     * 根据Id查询对象信息。多表连表查询
     * @param id 对象Id
     * @return SkillVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    SkillVO getDetailById(Long id);

    /**
     * 根据条件查询对象信息。多表连表查询
     * @param qo SkillQO查询对象
     * @return SkillVO 对象信息
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    SkillVO getDetailByCondition(SkillQO qo);
    
    /**
     * 根据条件查询对象列表。多表连表查询
     * 
     * @param qo SkillQO查询对象
     * @return List<SkillVO> SkillVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    List<SkillVO> queryDetailList(SkillQO qo);
    
    /**
     * 根据条件统计。多表连表查询
     * @param qo SkillQO查询对象
     * @return long 记录条数
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    long countDetail(SkillQO qo);
    
    /**
     * 根据条件分页查询对象列表。多表连表查询
     * 
     * @param qo SkillQO查询对象
     * @return List<SkillVO> SkillVO对象列表
     * @author: saz
     * @date: 2017-04-06 10:08:21
     */
    List<SkillVO> queryDetailPage(SkillQO qo);
}

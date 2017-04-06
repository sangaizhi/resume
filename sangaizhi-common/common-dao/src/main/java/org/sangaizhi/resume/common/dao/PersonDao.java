package org.sangaizhi.resume.common.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.sangaizhi.resume.common.qo.PersonQO;
import org.sangaizhi.resume.common.vo.PersonVO;

/**
 * @description: PersonDao
 * @author: saz
 * @date: 2017-04-05 18:36:04
 */
@Repository
public interface PersonDao {
    /**
     * 根据Id查询对象信息。单表查询，无连表操作
     * @param id 对象Id
     * @return PersonVO 对象信息
     */
    PersonVO getById(Long id);

    /**
     * 根据条件查询对象信息。单表查询，无连表操作
     * @param qo PersonQO查询对象
     * @return PersonVO 对象信息
     */
    PersonVO getByCondition(PersonQO qo);
    
    /**
     * 根据条件统计。单表查询，无连表操作
     * @param qo PersonQO查询对象
     * @return long 记录条数
     */
    long count(PersonQO qo);

    /**
     * 根据条件查询对象列表。单表查询，无连表操作
     * 
     * @param qo PersonQO查询对象
     * @return List<PersonVO> PersonVO对象列表
     */
    List<PersonVO> queryList(PersonQO qo);
    
    /**
     * 根据条件分页查询对象列表。单表查询，无连表操作
     * 
     * @param qo PersonQO查询对象
     * @return List<PersonVO> PersonVO对象列表
     */
    List<PersonVO> queryPage(PersonQO qo);

    /**
     * 保存对象信息
     * 
     * @param vo PersonVO对象信息
     * @return int 保存成功的记录条数
     */
    int save(PersonVO vo);

    /**
     * 批量保存对象信息
     * 
     * @param voList PersonVO对象列表
     * @return int 保存成功的记录条数
     */
    int saveBatch(List<PersonVO> voList);

    /**
     * 根据Id修改对象信息
     * 
     * @param vo PersonVO对象
     * @return int 修改成功的记录条数
     */
    int updateById(PersonVO vo);
    
    /**
     * 根据Id删除对象信息
     * 
     * @param id PersonVO对象Id
     * @return int 删除成功的记录条数
     */
    int deleteById(Long id);

    /**
     * 根据Id批量删除对象信息
     * 
     * @param ids PersonVO对象Id集合
     * @return int 删除成功的记录条数
     */
    int deleteBatchByIds(List<Long> ids);
    
    /**
     * 根据Id查询对象信息。多表连表查询
     * @param id 对象Id
     * @return PersonVO 对象信息
     */
    PersonVO getDetailById(Long id);

    /**
     * 根据条件查询对象信息。多表连表查询
     * @param qo PersonQO查询对象
     * @return PersonVO 对象信息
     */
    PersonVO getDetailByCondition(PersonQO qo);
    
    /**
     * 根据条件查询对象列表。多表连表查询
     * 
     * @param qo PersonQO查询对象
     * @return List<PersonVO> PersonVO对象列表
     */
    List<PersonVO> queryDetailList(PersonQO qo);
    
    /**
     * 根据条件统计。多表连表查询
     * @param qo PersonQO查询对象
     * @return long 记录条数
     */
    long countDetail(PersonQO qo);
    
    /**
     * 根据条件分页查询对象列表。多表连表查询
     * 
     * @param qo PersonQO查询对象
     * @return List<PersonVO> PersonVO对象列表
     */
    List<PersonVO> queryDetailPage(PersonQO qo);
}

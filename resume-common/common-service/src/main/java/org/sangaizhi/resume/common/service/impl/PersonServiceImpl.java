package org.sangaizhi.resume.common.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.sangaizhi.resume.common.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sangaizhi.resume.common.qo.PersonQO;
import org.sangaizhi.resume.common.vo.PersonVO;
import org.sangaizhi.resume.common.dao.PersonDao;

/**
 * @Description: PersonService 实现类
 * @author: saz
 * @date: 2017-04-05 18:36:04
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    @Transactional(readOnly = true)
    public PersonVO getById(Long id) {
        if (id == null) {
            return null;
        }
        return personDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public PersonVO getByCondition(PersonQO qo) {
        if (qo == null) {
            return null;
        }
        return personDao.getByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonVO> queryList(PersonQO qo) {
        if (qo == null) {
            return null;
        }
        return personDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(PersonQO qo) {
        if (qo == null) {
            return 0;
        }
        return personDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<PersonVO> queryPage(PersonQO qo) {
        if (qo == null) {
            return null;
        }
        return personDao.queryPage(qo); 
    }

    @Override
    public int save(PersonVO vo) {
        if (vo == null) {
            return 0;
        }
        return personDao.save(vo);
    }

    @Override
    public int saveBatch(List<PersonVO> voList) {
        if (CollectionUtils.isEmpty(voList)) {
            return 0;
        }
        return personDao.saveBatch(voList);
    }

    @Override
    public int updateById(PersonVO vo) {
        if (vo == null) {
            return 0;
        }
        return personDao.updateById(vo);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return personDao.deleteById(id);
    }

    @Override
    public int deleteBatchByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return personDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public PersonVO getDetailById(Long id) {
        if (id == null) {
            return null;
        }
        return personDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public PersonVO getDetailByCondition(PersonQO qo) {
        if (qo == null) {
            return null;
        }
        return personDao.getDetailByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonVO> queryDetailList(PersonQO qo) {
        if (qo == null) {
            return null;
        }
        return personDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(PersonQO qo) {
        if (qo == null) {
            return 0;
        }
        return personDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<PersonVO> queryDetailPage(PersonQO qo) {
        if (qo == null) {
            return null;
        }
        return personDao.queryDetailPage(qo); 
    }
}

package org.sangaizhi.resume.common.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sangaizhi.resume.common.qo.ExperienceQO;
import org.sangaizhi.resume.common.vo.ExperienceVO;
import org.sangaizhi.resume.common.service.ExperienceService;
import org.sangaizhi.resume.common.dao.ExperienceDao;

/**
 * @Description: ExperienceService 实现类
 * @author: saz
 * @date: 2017-04-06 09:52:59
 */
@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceDao experienceDao;

    @Override
    @Transactional(readOnly = true)
    public ExperienceVO getById(Long id) {
        if (id == null) {
            return null;
        }
        return experienceDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public ExperienceVO getByCondition(ExperienceQO qo) {
        if (qo == null) {
            return null;
        }
        return experienceDao.getByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ExperienceVO> queryList(ExperienceQO qo) {
        if (qo == null) {
            return null;
        }
        return experienceDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(ExperienceQO qo) {
        if (qo == null) {
            return 0;
        }
        return experienceDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<ExperienceVO> queryPage(ExperienceQO qo) {
        if (qo == null) {
            return null;
        }
        return experienceDao.queryPage(qo); 
    }

    @Override
    public int save(ExperienceVO vo) {
        if (vo == null) {
            return 0;
        }
        return experienceDao.save(vo);
    }

    @Override
    public int saveBatch(List<ExperienceVO> voList) {
        if (CollectionUtils.isEmpty(voList)) {
            return 0;
        }
        return experienceDao.saveBatch(voList);
    }

    @Override
    public int updateById(ExperienceVO vo) {
        if (vo == null) {
            return 0;
        }
        return experienceDao.updateById(vo);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return experienceDao.deleteById(id);
    }

    @Override
    public int deleteBatchByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return experienceDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public ExperienceVO getDetailById(Long id) {
        if (id == null) {
            return null;
        }
        return experienceDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public ExperienceVO getDetailByCondition(ExperienceQO qo) {
        if (qo == null) {
            return null;
        }
        return experienceDao.getDetailByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ExperienceVO> queryDetailList(ExperienceQO qo) {
        if (qo == null) {
            return null;
        }
        return experienceDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(ExperienceQO qo) {
        if (qo == null) {
            return 0;
        }
        return experienceDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<ExperienceVO> queryDetailPage(ExperienceQO qo) {
        if (qo == null) {
            return null;
        }
        return experienceDao.queryDetailPage(qo); 
    }
}

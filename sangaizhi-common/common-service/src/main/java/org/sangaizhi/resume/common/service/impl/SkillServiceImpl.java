package org.sangaizhi.resume.common.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sangaizhi.resume.common.qo.SkillQO;
import org.sangaizhi.resume.common.vo.SkillVO;
import org.sangaizhi.resume.common.service.SkillService;
import org.sangaizhi.resume.common.dao.SkillDao;

/**
 * @Description: SkillService 实现类
 * @author: saz
 * @date: 2017-04-06 10:08:21
 */
@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillDao skillDao;

    @Override
    @Transactional(readOnly = true)
    public SkillVO getById(Long id) {
        if (id == null) {
            return null;
        }
        return skillDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public SkillVO getByCondition(SkillQO qo) {
        if (qo == null) {
            return null;
        }
        return skillDao.getByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SkillVO> queryList(SkillQO qo) {
        if (qo == null) {
            return null;
        }
        return skillDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(SkillQO qo) {
        if (qo == null) {
            return 0;
        }
        return skillDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<SkillVO> queryPage(SkillQO qo) {
        if (qo == null) {
            return null;
        }
        return skillDao.queryPage(qo); 
    }

    @Override
    public int save(SkillVO vo) {
        if (vo == null) {
            return 0;
        }
        return skillDao.save(vo);
    }

    @Override
    public int saveBatch(List<SkillVO> voList) {
        if (CollectionUtils.isEmpty(voList)) {
            return 0;
        }
        return skillDao.saveBatch(voList);
    }

    @Override
    public int updateById(SkillVO vo) {
        if (vo == null) {
            return 0;
        }
        return skillDao.updateById(vo);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return skillDao.deleteById(id);
    }

    @Override
    public int deleteBatchByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return skillDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public SkillVO getDetailById(Long id) {
        if (id == null) {
            return null;
        }
        return skillDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public SkillVO getDetailByCondition(SkillQO qo) {
        if (qo == null) {
            return null;
        }
        return skillDao.getDetailByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SkillVO> queryDetailList(SkillQO qo) {
        if (qo == null) {
            return null;
        }
        return skillDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(SkillQO qo) {
        if (qo == null) {
            return 0;
        }
        return skillDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<SkillVO> queryDetailPage(SkillQO qo) {
        if (qo == null) {
            return null;
        }
        return skillDao.queryDetailPage(qo); 
    }
}

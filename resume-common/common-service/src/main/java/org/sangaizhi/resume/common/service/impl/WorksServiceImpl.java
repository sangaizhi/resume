package org.sangaizhi.resume.common.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.sangaizhi.resume.common.qo.WorksQO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sangaizhi.resume.common.vo.WorksVO;
import org.sangaizhi.resume.common.service.WorksService;
import org.sangaizhi.resume.common.dao.WorksDao;

/**
 * @Description: WorksService 实现类
 * @author: saz
 * @date: 2017-04-06 10:11:24
 */
@Service
public class WorksServiceImpl implements WorksService {

    @Autowired
    private WorksDao worksDao;

    @Override
    @Transactional(readOnly = true)
    public WorksVO getById(Long id) {
        if (id == null) {
            return null;
        }
        return worksDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public WorksVO getByCondition(WorksQO qo) {
        if (qo == null) {
            return null;
        }
        return worksDao.getByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<WorksVO> queryList(WorksQO qo) {
        if (qo == null) {
            return null;
        }
        return worksDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(WorksQO qo) {
        if (qo == null) {
            return 0;
        }
        return worksDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<WorksVO> queryPage(WorksQO qo) {
        if (qo == null) {
            return null;
        }
        return worksDao.queryPage(qo); 
    }

    @Override
    public int save(WorksVO vo) {
        if (vo == null) {
            return 0;
        }
        return worksDao.save(vo);
    }

    @Override
    public int saveBatch(List<WorksVO> voList) {
        if (CollectionUtils.isEmpty(voList)) {
            return 0;
        }
        return worksDao.saveBatch(voList);
    }

    @Override
    public int updateById(WorksVO vo) {
        if (vo == null) {
            return 0;
        }
        return worksDao.updateById(vo);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return worksDao.deleteById(id);
    }

    @Override
    public int deleteBatchByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return worksDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public WorksVO getDetailById(Long id) {
        if (id == null) {
            return null;
        }
        return worksDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public WorksVO getDetailByCondition(WorksQO qo) {
        if (qo == null) {
            return null;
        }
        return worksDao.getDetailByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<WorksVO> queryDetailList(WorksQO qo) {
        if (qo == null) {
            return null;
        }
        return worksDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(WorksQO qo) {
        if (qo == null) {
            return 0;
        }
        return worksDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<WorksVO> queryDetailPage(WorksQO qo) {
        if (qo == null) {
            return null;
        }
        return worksDao.queryDetailPage(qo); 
    }
}

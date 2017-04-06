package org.sangaizhi.resume.common.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.sangaizhi.resume.common.service.WorksCategoryService;
import org.sangaizhi.resume.common.qo.WorksCategoryQO;
import org.sangaizhi.resume.common.vo.WorksCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sangaizhi.resume.common.dao.WorksCategoryDao;

/**
 * @Description: WorksCategoryService 实现类
 * @author: saz
 * @date: 2017-04-06 10:13:18
 */
@Service
public class WorksCategoryServiceImpl implements WorksCategoryService {

    @Autowired
    private WorksCategoryDao worksCategoryDao;

    @Override
    @Transactional(readOnly = true)
    public WorksCategoryVO getById(Long id) {
        if (id == null) {
            return null;
        }
        return worksCategoryDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public WorksCategoryVO getByCondition(WorksCategoryQO qo) {
        if (qo == null) {
            return null;
        }
        return worksCategoryDao.getByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<WorksCategoryVO> queryList(WorksCategoryQO qo) {
        if (qo == null) {
            return null;
        }
        return worksCategoryDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(WorksCategoryQO qo) {
        if (qo == null) {
            return 0;
        }
        return worksCategoryDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<WorksCategoryVO> queryPage(WorksCategoryQO qo) {
        if (qo == null) {
            return null;
        }
        return worksCategoryDao.queryPage(qo); 
    }

    @Override
    public int save(WorksCategoryVO vo) {
        if (vo == null) {
            return 0;
        }
        return worksCategoryDao.save(vo);
    }

    @Override
    public int saveBatch(List<WorksCategoryVO> voList) {
        if (CollectionUtils.isEmpty(voList)) {
            return 0;
        }
        return worksCategoryDao.saveBatch(voList);
    }

    @Override
    public int updateById(WorksCategoryVO vo) {
        if (vo == null) {
            return 0;
        }
        return worksCategoryDao.updateById(vo);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return worksCategoryDao.deleteById(id);
    }

    @Override
    public int deleteBatchByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return worksCategoryDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public WorksCategoryVO getDetailById(Long id) {
        if (id == null) {
            return null;
        }
        return worksCategoryDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public WorksCategoryVO getDetailByCondition(WorksCategoryQO qo) {
        if (qo == null) {
            return null;
        }
        return worksCategoryDao.getDetailByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<WorksCategoryVO> queryDetailList(WorksCategoryQO qo) {
        if (qo == null) {
            return null;
        }
        return worksCategoryDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(WorksCategoryQO qo) {
        if (qo == null) {
            return 0;
        }
        return worksCategoryDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<WorksCategoryVO> queryDetailPage(WorksCategoryQO qo) {
        if (qo == null) {
            return null;
        }
        return worksCategoryDao.queryDetailPage(qo); 
    }
}

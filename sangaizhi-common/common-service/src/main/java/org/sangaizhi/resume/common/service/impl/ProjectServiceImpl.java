package org.sangaizhi.resume.common.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.sangaizhi.resume.common.service.ProjectService;
import org.sangaizhi.resume.common.qo.ProjectQO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sangaizhi.resume.common.vo.ProjectVO;
import org.sangaizhi.resume.common.dao.ProjectDao;

/**
 * @Description: ProjectService 实现类
 * @author: saz
 * @date: 2017-04-06 10:01:01
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    @Transactional(readOnly = true)
    public ProjectVO getById(Long id) {
        if (id == null) {
            return null;
        }
        return projectDao.getById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public ProjectVO getByCondition(ProjectQO qo) {
        if (qo == null) {
            return null;
        }
        return projectDao.getByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProjectVO> queryList(ProjectQO qo) {
        if (qo == null) {
            return null;
        }
        return projectDao.queryList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long count(ProjectQO qo) {
        if (qo == null) {
            return 0;
        }
        return projectDao.count(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<ProjectVO> queryPage(ProjectQO qo) {
        if (qo == null) {
            return null;
        }
        return projectDao.queryPage(qo); 
    }

    @Override
    public int save(ProjectVO vo) {
        if (vo == null) {
            return 0;
        }
        return projectDao.save(vo);
    }

    @Override
    public int saveBatch(List<ProjectVO> voList) {
        if (CollectionUtils.isEmpty(voList)) {
            return 0;
        }
        return projectDao.saveBatch(voList);
    }

    @Override
    public int updateById(ProjectVO vo) {
        if (vo == null) {
            return 0;
        }
        return projectDao.updateById(vo);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return projectDao.deleteById(id);
    }

    @Override
    public int deleteBatchByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return 0;
        }
        return projectDao.deleteBatchByIds(ids);
    }
    
    @Override
    @Transactional(readOnly = true)
    public ProjectVO getDetailById(Long id) {
        if (id == null) {
            return null;
        }
        return projectDao.getDetailById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public ProjectVO getDetailByCondition(ProjectQO qo) {
        if (qo == null) {
            return null;
        }
        return projectDao.getDetailByCondition(qo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProjectVO> queryDetailList(ProjectQO qo) {
        if (qo == null) {
            return null;
        }
        return projectDao.queryDetailList(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public long countDetail(ProjectQO qo) {
        if (qo == null) {
            return 0;
        }
        return projectDao.countDetail(qo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<ProjectVO> queryDetailPage(ProjectQO qo) {
        if (qo == null) {
            return null;
        }
        return projectDao.queryDetailPage(qo); 
    }
}

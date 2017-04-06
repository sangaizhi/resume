package org.sangaizhi.resume.common.qo;

import org.sangaizhi.resume.commons.util.PageUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: WorksCategoryQO 查询对象
 * @author: saz
 * @date: 2017-04-06 10:13:18
 */
public class WorksCategoryQO extends PageUtil implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 所属个人
     */
    private Long personId;

    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 创建时间
     */
    private Date createTimeBegin;

    /**
     * 创建时间
     */
    private Date createTimeEnd;

    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
     * 更新时间
     */
    private Date updateTimeBegin;

    /**
     * 更新时间
     */
    private Date updateTimeEnd;

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Long getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }  
    
    public Date getCreateTimeBegin() {
        return this.createTimeBegin;
    }
    
    public void setCreateTimeBegin(Date createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }    
    
    public Date getCreateTimeEnd() {
        return this.createTimeEnd;
    }
    
    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }
    
    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }  
    
    public Date getUpdateTimeBegin() {
        return this.updateTimeBegin;
    }
    
    public void setUpdateTimeBegin(Date updateTimeBegin) {
        this.updateTimeBegin = updateTimeBegin;
    }    
    
    public Date getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }
    
    public void setUpdateTimeEnd(Date updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }
    
}

package org.sangaizhi.resume.common.qo;

import org.sangaizhi.resume.commons.util.PageUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: ExperienceQO 查询对象
 * @author: saz
 * @date: 2017-04-06 09:52:59
 */
public class ExperienceQO extends PageUtil implements Serializable {

    /**
     * 主键
     */
    private Long id;

    
    /**
     * 开始时间
     */
    private Date startTime;
    
    /**
     * 开始时间
     */
    private Date startTimeBegin;

    /**
     * 开始时间
     */
    private Date startTimeEnd;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 职位
     */
    private String position;

    /**
     * 工作描述
     */
    private String description;

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
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }  
    
    public Date getStartTimeBegin() {
        return this.startTimeBegin;
    }
    
    public void setStartTimeBegin(Date startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
    }    
    
    public Date getStartTimeEnd() {
        return this.startTimeEnd;
    }
    
    public void setStartTimeEnd(Date startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
    }
    
    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

package org.sangaizhi.resume.common.qo;

import org.sangaizhi.resume.commons.util.PageUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: ProjectQO 查询对象
 * @author: saz
 * @date: 2017-04-06 10:01:01
 */
public class ProjectQO extends PageUtil implements Serializable {

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
    private Date endTime;
    
    /**
     * 结束时间
     */
    private Date endTimeBegin;

    /**
     * 结束时间
     */
    private Date endTimeEnd;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目描述
     */
    private String descripttion;

    /**
     * 责任描述
     */
    private String responsibility;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 所属个人
     */
    private Long personId;

    /**
     * 项目展示地址
     */
    private String showAddr;

    
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
    
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }  
    
    public Date getEndTimeBegin() {
        return this.endTimeBegin;
    }
    
    public void setEndTimeBegin(Date endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
    }    
    
    public Date getEndTimeEnd() {
        return this.endTimeEnd;
    }
    
    public void setEndTimeEnd(Date endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescripttion() {
        return this.descripttion;
    }
    
    public void setDescripttion(String descripttion) {
        this.descripttion = descripttion;
    }
    public String getResponsibility() {
        return this.responsibility;
    }
    
    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    public Long getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    public String getShowAddr() {
        return this.showAddr;
    }
    
    public void setShowAddr(String showAddr) {
        this.showAddr = showAddr;
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

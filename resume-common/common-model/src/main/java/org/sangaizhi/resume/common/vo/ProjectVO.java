package org.sangaizhi.resume.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: ProjectVO 值对象
 * @author: saz
 * @date: 2017-04-06 10:01:01
 */
public class ProjectVO implements Serializable {

    /**
     * 主键 
     */
    private Long id;
    /**
     * 开始时间 
     */
    private Date startTime;
    /**
     * 结束时间 
     */
    private Date endTime;
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
     * 更新时间 
     */
    private Date updateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setDescripttion(String descripttion) {
        this.descripttion = descripttion;
    }

    public String getDescripttion() {
        return this.descripttion;
    }
    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getResponsibility() {
        return this.responsibility;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getPersonId() {
        return this.personId;
    }
    public void setShowAddr(String showAddr) {
        this.showAddr = showAddr;
    }

    public String getShowAddr() {
        return this.showAddr;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }
}


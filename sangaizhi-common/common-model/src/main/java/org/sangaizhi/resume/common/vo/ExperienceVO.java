package org.sangaizhi.resume.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: ExperienceVO 值对象
 * @author: saz
 * @date: 2017-04-06 09:52:59
 */
public class ExperienceVO implements Serializable {

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
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getPersonId() {
        return this.personId;
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


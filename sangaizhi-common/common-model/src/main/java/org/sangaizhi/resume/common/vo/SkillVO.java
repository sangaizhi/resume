package org.sangaizhi.resume.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: SkillVO 值对象
 * @author: saz
 * @date: 2017-04-06 10:08:21
 */
public class SkillVO implements Serializable {

    /**
     * 主键 
     */
    private Long id;
    /**
     * 名称 
     */
    private String name;
    /**
     * 熟练程度 
     */
    private String proficiency;
    /**
     * 描述 
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
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public String getProficiency() {
        return this.proficiency;
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


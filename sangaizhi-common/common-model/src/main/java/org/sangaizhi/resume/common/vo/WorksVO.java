package org.sangaizhi.resume.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: WorksVO 值对象
 * @author: saz
 * @date: 2017-04-06 10:11:24
 */
public class WorksVO implements Serializable {

    /**
     * 主键 
     */
    private Long id;
    /**
     * 作品详情 
     */
    private String detail;
    /**
     * 作品描述 
     */
    private String description;
    /**
     * 封面图片地址 
     */
    private String coverImg;
    /**
     * 作品标题 
     */
    private String title;
    /**
     * 所属个人 
     */
    private Long personId;
    /**
     * 分类ID 
     */
    private Long worksCategoryId;
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
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return this.detail;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getCoverImg() {
        return this.coverImg;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getPersonId() {
        return this.personId;
    }
    public void setWorksCategoryId(Long worksCategoryId) {
        this.worksCategoryId = worksCategoryId;
    }

    public Long getWorksCategoryId() {
        return this.worksCategoryId;
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


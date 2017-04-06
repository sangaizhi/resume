package org.sangaizhi.resume.common.qo;

import org.sangaizhi.resume.commons.util.PageUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: PersonQO 查询对象
 * @author: saz
 * @date: 2017-04-05 18:36:04
 */
public class PersonQO extends PageUtil implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 籍贯
     */
    private String nativeAddr;

    /**
     * 性别
     */
    private Short sex;

    /**
     * 头像
     */
    private String headImg;

    /**
     * 图片1
     */
    private String image1;

    /**
     * 图片2
     */
    private String image2;

    /**
     * 图片3
     */
    private String image3;

    /**
     * 个人主页
     */
    private String webSite;

    /**
     * 微博地址
     */
    private String weiboAddr;

    /**
     * 博客地址
     */
    private String blogAddr;

    
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
    public String getNickName() {
        return this.nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNativeAddr() {
        return this.nativeAddr;
    }
    
    public void setNativeAddr(String nativeAddr) {
        this.nativeAddr = nativeAddr;
    }
    public Short getSex() {
        return this.sex;
    }
    
    public void setSex(Short sex) {
        this.sex = sex;
    }
    public String getHeadImg() {
        return this.headImg;
    }
    
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }
    public String getImage1() {
        return this.image1;
    }
    
    public void setImage1(String image1) {
        this.image1 = image1;
    }
    public String getImage2() {
        return this.image2;
    }
    
    public void setImage2(String image2) {
        this.image2 = image2;
    }
    public String getImage3() {
        return this.image3;
    }
    
    public void setImage3(String image3) {
        this.image3 = image3;
    }
    public String getWebSite() {
        return this.webSite;
    }
    
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
    public String getWeiboAddr() {
        return this.weiboAddr;
    }
    
    public void setWeiboAddr(String weiboAddr) {
        this.weiboAddr = weiboAddr;
    }
    public String getBlogAddr() {
        return this.blogAddr;
    }
    
    public void setBlogAddr(String blogAddr) {
        this.blogAddr = blogAddr;
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

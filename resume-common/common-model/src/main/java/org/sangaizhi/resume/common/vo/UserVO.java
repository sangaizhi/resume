package org.sangaizhi.resume.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: UserVO 值对象
 * @author: saz
 * @date: 2017-04-06 16:06:28
 */
public class UserVO implements Serializable {

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
     * 性别 
     */
    private Short sex;
    /**
     * 头像 
     */
    private String headImg;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;
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
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return this.nickName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Short getSex() {
        return this.sex;
    }
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getHeadImg() {
        return this.headImg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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


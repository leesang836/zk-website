package com.zki.website.user.entity;

import javax.persistence.*;

/**
 * Filename:    com.zki.website.user.entity
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-09 01:26
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-09  LPF      1.0     1.0 Version
 */
@Entity
@Table(name = "t_zki_web_user")
public class UserEntity {
    @Id
    @Column(name="uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uuid;

    @Column(name = "userName")
    private String username;

    @Column(name = "passWord")
    private String passWord;

    @Column(name = "realName")
    private String realname;

    @Column(name = "salt")
    private String salt;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "phoneNo")
    private Integer phoneNo;

    @Column(name = "telNo")
    private Integer telNo;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getTelNo() {
        return telNo;
    }

    public void setTelNo(Integer telNo) {
        this.telNo = telNo;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "uuid=" + uuid +
                ", username='" + username + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realname='" + realname + '\'' +
                ", salt='" + salt + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phoneNo=" + phoneNo +
                ", telNo=" + telNo +
                '}';
    }
}

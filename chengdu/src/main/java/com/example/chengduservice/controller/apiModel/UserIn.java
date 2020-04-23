package com.example.chengduservice.controller.apiModel;

import com.example.chengduservice.entity.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * create by yongli on 2019-09-25 20:25
 * 让用户手动填写日期，有点为难用户了
 */

public class UserIn {
    private Integer userId; // 用户账号的唯一id
    private String pwd; // 先名为存储，后面加密存储
    private String name;  // 这个
    private String role;
    private Integer age;
    private Boolean gender;
    private String phoneNumber;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User toUser() {
        Date date = new Date();
        // 这是时间的一种标准格式
        // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        User user = new User();
        user.setUserId(userId);
        user.setPwd(pwd);
        user.setName(name);
        user.setRole(role);
        user.setGender(gender);
        user.setPhoneNumber(phoneNumber);
        user.setRegistryDate(date);
        return user;
    }
}

package com.example.demo.model;

import java.util.Date;

/**
 * 用户对象，非常重要的实体类。
 */
public class User {

    Integer id;
    String pwd;   // 密码要加密，注意一下。
    String name;
    String phoneNumber;
    Integer age;
    Boolean gender;
    Date birth;
    String email;
    String place;
//空构造器也有用
    public User() {
    }

    public User(String pwd, String name, String email) {
        this.pwd = pwd;
        this.name = name;
        this.email = email;
    }

    public User(Integer id, String pwd, String name, String phoneNumber, Integer age, Boolean gender, Date birth, String email, String place) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.email = email;
        this.place = place;
    }

    public User(String pwd, String name, String phoneNumber, Integer age, Boolean gender, Date birth, String email, String place) {
        this.pwd = pwd;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.email = email;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}

package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * create by yongli on 2020-05-20 22:43
 */

public class World implements Serializable {
    private String name;
    private Integer age;
    private Date date;

    public World() {
    }

    public World(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

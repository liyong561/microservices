package com.example.demo.model;

public class BookAuthor {
    Integer id;
    String name;
    Integer age;
    String country;
    String job;
    String intro;
    String otherBooks;
    //在返回值阶段，它默认返回了id字段，所以需要调用这个构造器
    public BookAuthor(Integer id, String name, Integer age, String country, String job, String intro, String otherBooks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.job = job;
        this.intro = intro;
        this.otherBooks = otherBooks;
    }

    public BookAuthor(String name, Integer age, String country, String job, String intro, String otherBooks) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.job = job;
        this.intro = intro;
        this.otherBooks = otherBooks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getOtherBooks() {
        return otherBooks;
    }

    public void setOtherBooks(String otherBooks) {
        this.otherBooks = otherBooks;
    }
}

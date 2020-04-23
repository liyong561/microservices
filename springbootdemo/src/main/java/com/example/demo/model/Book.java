package com.example.demo.model;

import java.io.Serializable;

/**
 * 关于book的属性你很清楚了，写的像一点。entity就是实体类的封装，不做别的事情。
 * */
public class Book implements Serializable{
    private long id;  // mysql中是bigint
    String isbn;
    String title;
    String author;

    public Book() {
    }

    public Book(long id, String isbn, String title, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

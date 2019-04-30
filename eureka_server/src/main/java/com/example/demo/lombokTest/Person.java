package com.example.demo.lombokTest;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
    private String country = "China";
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }


}

package com.example.msv.entity;

import lombok.Data;

@Data
public class SimpleEntity {
    int id;
    String name;

    public SimpleEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

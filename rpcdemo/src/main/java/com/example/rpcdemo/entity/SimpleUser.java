package com.example.rpcdemo.entity;

import lombok.Data;

/**
 * create by yongli on 2019-06-08 15:51
 */
@Data
public class SimpleUser {
    public SimpleUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int id;
    String name;

}

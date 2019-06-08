package com.example.msv.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {

    /**
     * 用户id，用户的唯一标识
     */

    private long userId;
    private String userName;
    private String mobile;
    private String password;
    /**
     *mobile不怎么进行数值操作，所以类型我String更好
     */
    private Date createDate;

}

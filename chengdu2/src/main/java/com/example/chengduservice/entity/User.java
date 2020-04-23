package com.example.chengduservice.entity;

import lombok.Data;

import java.util.Date;

/**
 * 使用者实体账户，只加入基本的信息
 */
@Data
public class User {
    Integer userId; // 用户账号的唯一id
    String pwd; // 先名为存储，后面加密存储
    String name;  // 这个
    String role;
    Integer age;
    Boolean gender;
    String phoneNumber;
    Date  registryDate;
}

package com.example.chengduservice.entity;

import lombok.Data;

/**
 * create by yongli on 2019-09-21 21:52
 * 这个是商家的账号主体，有不用于用户的属性 b2c
 * 描述商家的具体结构
 */
@Data
public class Business {
    Integer userId; // 用户账号的唯一id,
    Float reputation;
    String introduction;
    String labels;
}

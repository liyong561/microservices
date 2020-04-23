package com.example.chengduservice.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户评论实体,模仿一下京东的评论模块设计
 */
@Data
public class Comment {
    Integer id;
    Integer userId;
    Integer serviceId;
    String commentWord;
    /**
     * 图片地址，最多五张,前端控制
     */

    String urls;
    Float star;
    Date commentDate;
}
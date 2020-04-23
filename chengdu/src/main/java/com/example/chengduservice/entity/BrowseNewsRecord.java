package com.example.chengduservice.entity;

import lombok.Data;

/**
 *用户浏览新闻的足迹,用于用户画像，进行分
 */
@Data
public class BrowseNewsRecord {
    /**
     * 在数据库中经常更新的数据
     */
    Integer id;
    Integer userId;
    Integer newsId;
    String title;
}

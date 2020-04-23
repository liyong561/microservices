package com.example.chengduservice.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 该项目的核心实体，以news为中心设计，保证了系统复杂度相对较小，但是功能较为全面。
 * 后期考虑扩展，添加更多的内容和功能。
 * 数据库中没有list字段，只能先存储string,取出后处理
 * 整一个超长的表
 * 适当的数据冗余，加快crud
 */
@Data
public class News {
    Integer newsId; // 使用对象，避免没有数据时null赋值报错,使用newId可能更好理解
    String type;
    String subType;
    String zone;
    Boolean isHealthy;  //
    String newsStatus;  // 状态，比如
    Date releaseDate; // 再新闻中属于很重要的数据,但是不要直接命名为date，因为在数据库中重名，这是很难的一件事
    String title;
    String newsAbstract;
    String contentUrl; // 数据库不存储这种数量量大，使用那么平凡的数据，使用专用的文件存储
    String picUrls;
    String author;
    String labels; // 使用；分隔，向用户个性化推送新闻
    Integer viewCount;
    Integer commentCount;
    String item1;
    String item2;
    String item3;
    String item4;
    String item5;
    String item6;
    String item7;

}

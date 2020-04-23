package com.example.chengduservice.entity;

import lombok.Data;

/**
 * 酒店信息,但是不是商家主体信息
 */
@Data
public class Hotel {
    /**
     * 图片地址，因为不止一个，这种字段怎么放置？
     * 单独放置感觉太浪费，对性能也不好，但是放在一起也会让操作不怎么方便
     * 当是，应该考虑到业务场景，还是读的时候多，写的词数较少，同时修改也很少，所以还是放在一起吧
     */
    Integer hotelId; // 这个很短的id还是有很好的区分作用
    Integer ownerId;
    String name;
    Float star;  // 酒店评分
    String establishedYear;
    String introduction;
    String policy;
    String location;
    // 还有就是各种图片
    String picUrls;
    String detail; // 用于兼容其他信息
}

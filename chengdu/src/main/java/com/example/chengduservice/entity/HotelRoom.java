package com.example.chengduservice.entity;

import lombok.Data;

/**
 * create by yongli on 2019-09-20 21:54
 * 关于房价的信息，例如双人床，大床房，合住宿舍等
 */
@Data
public class HotelRoom {
    Integer roomId;
    Integer hotelId; // String和Integer描述id各有利弊，需要自己衡量
    Float size;
    Integer personNum;
    Integer remainingNum; // 注意这个样的房间可能有多个
    Float price;
    String floor; // 所在层，只需要简单描述
    String paymentTerm; // 这个都是接受指定字段，不接受用户随意输入

}

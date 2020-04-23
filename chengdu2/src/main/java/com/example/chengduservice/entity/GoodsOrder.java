package com.example.chengduservice.entity;

import lombok.Data;

import java.util.Date;

/**
 * create by yongli on 2019-09-20 22:27
 * 用户的交易订单,这只是一个很简单的模型，实际应该很复杂
 */
@Data
public class GoodsOrder {
    String orderId;
    String userId;
    String goodId;
    Float price;
    Integer quantity;
    Date startTime;
    Boolean payState; // false我支付，true已支付
    Integer duration; // 未支付持续时间
    Float totalPrice;
}

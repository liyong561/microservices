package com.example.chengduservice.service;

import com.example.chengduservice.entity.GoodsOrder;

/**
 * create by yongli on 2019-09-22 16:06
 *
 */

public interface GoodsOrderService {
    void add(GoodsOrder goodsOrder);
    GoodsOrder getByUserId(Integer userId);
}

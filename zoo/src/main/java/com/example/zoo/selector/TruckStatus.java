package com.example.zoo.selector;

/**
 * create by yongli on 2020-04-02 19:32
 *  1 >> 1;
 *
 *  1+ 2 = 3 就代表监控就绪和故障转态
 */

public interface TruckStatus {
    // 还是用数值来代表状态好处理
    int READEY = 1;
    int fault = 1 >> 1;
    int ongoing = 1>> 1>>1;
}

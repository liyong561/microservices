package com.example.chengduservice.config;

/**
 * create by yongli on 2019-09-26 23:31
 * 类也能完成数据的封装，本质上说，实体类也是一个对象，Class类
 */

public class Singleton {
    private static  String name;
    private static float income;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Singleton.name = name;
    }

    public static float getIncome() {
        return income;
    }

    public static void setIncome(float income) {
        Singleton.income = income;
    }
}
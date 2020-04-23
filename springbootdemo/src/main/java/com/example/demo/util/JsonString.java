package com.example.demo.util;

import com.alibaba.fastjson.JSONObject;

/**
 * 以json的形式返回信息
 */
public class JsonString {
    public static String getJsonString(int code, String msg) {
        JSONObject jsonObject = new JSONObject();
        // 这个操作就相当于map的操作。
        jsonObject.put(String.valueOf(code), msg);
        return jsonObject.toJSONString();
    }

    public static String add3s(String name) {
        name = name + "3s";
        return name;
    }

}

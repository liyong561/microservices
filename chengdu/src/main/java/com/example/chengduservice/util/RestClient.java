package com.example.chengduservice.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * create by yongli on 2020-02-28 22:43
 * 是对restTemplate的包装
 * 如何在静态方法中使用这个对象。
 * 规则，静态域不能访问非静态域
 * Spring装配bean时调用了什么构造方法
 */

public class RestClient {


    private static RestTemplate restTemplate = new RestTemplate();


    public static String get(String url) {

        // return restTemplate.getForEntity(url,String.class); ResponseType
        return restTemplate.getForObject(url, String.class); // 直接解析为Object，获取对象


    }

    // post方法时，使用json还是post？
    public static String postJson(String url, JSONObject json) {
        // 相比于get方法，多了一个json的数据
        Map<String,Object> data =new HashMap<>();
        HttpHeaders headers = new HttpHeaders();
        headers.add("time","1993/12/2");
        // 这里是一个MultiValue的类
        HttpEntity<Map<String,Object>> entity = new HttpEntity<>(data,headers);
        return restTemplate.postForObject(url, data, String.class);
    }


}

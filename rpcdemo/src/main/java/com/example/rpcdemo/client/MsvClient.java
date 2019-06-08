package com.example.rpcdemo.client;

import com.example.rpcdemo.entity.SimpleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * create by yongli on 2019-06-08 14:55
 * 践行微服务思想，
 */
@Component
public class MsvClient {

    @Value("${msv-url}")
    private String msvUrl;

    @Autowired
    private RestTemplate restTemplate;

    public <T> T get(String path,Class<T> tClass,T obj){
        // 感觉这个tClass的用法很奇怪？
        String url = msvUrl+path;
        return restTemplate.getForObject(url,tClass,obj);
    }

}

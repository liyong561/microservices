package com.example.chengduservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * create by yongli on 2020-04-25 12:55
 * 难道可以使用注入的方法获取其属性吗？
 * Config注解也是spring管理的bean
 * 看别人代码学习的
 */
@Configuration
@ConfigurationProperties("sso")
public class SSOConfig {
    private String token;
    private String name;
    private List<String> keys;



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }
}

package com.example.liyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * create by yongli on 2020-03-25 22:53
 * 貌似也没有什么错误，但就是不行
 * 去排查
 * pom文件中的版本依赖
 * zuul兼容性有问题，还是影响使用
 * 预先假定了这些类的存在，但是又没有找到
 * zuul坑太多
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient

public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}

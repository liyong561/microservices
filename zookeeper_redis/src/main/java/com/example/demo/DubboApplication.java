package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 为什么每次调用别的内部服务，都要指明url，对返回转态判断，
 * 而不是像一个方法一样简单
 * 在服务中，我也使用RestClient,然后使用CommentResult后，很多方法也共用一个Get
 */
@SpringBootApplication
public class DubboApplication {

    public static void main(String[] args) {
        // there is a context,and many differences;
        SpringApplication.run(DubboApplication.class, args);
    }

}

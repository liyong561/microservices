package com.example.chengduservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.example.chengduservice.mapper")
@SpringBootApplication
public class ChengduServiceApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ChengduServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ChengduServiceApplication.class, args);
        char a = '黎'; // char
        System.out.println("good" + a);
    }
}

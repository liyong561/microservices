package com.example.demo.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * create by yongli on 2020-05-14 21:16
 */
@PropertySource("classpath:/dubbo_consumer.properties")
@EnableDubbo(scanBasePackages = "com.example.dubbo.service")
@ComponentScan(basePackages = "com.example.dubbo.service")
@Configuration
public class DubboConsumerConfig {
}

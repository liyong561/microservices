package com.example.demo.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * create by yongli on 2020-05-12 23:05
 * 使用Zookeeper注册服务，就不用使用controller发布服务了。
 * 结合spring1的注解，一起使用
 */

@Configuration
@PropertySource("classpath:dubbo_provider.properties")
public class DubboConfig {
}

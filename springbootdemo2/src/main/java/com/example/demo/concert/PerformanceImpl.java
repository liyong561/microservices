package com.example.demo.concert;

import org.springframework.stereotype.Component;

/**
 * 可以想象一下，在演唱会中又哪些功能比较集中的类
 * @Component和@Autowired用于spring中的自动装配，不用配置文件
 */
@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("I love China");
    }
}

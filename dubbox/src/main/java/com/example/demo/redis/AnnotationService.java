package com.example.demo.redis;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.common.GreetingService;
import org.springframework.stereotype.Component;

/**
 * create by yongli on 2020-05-14 21:16
 */
@Component
public class AnnotationService {

    /**
     * 这个注解也是dubbo中一个很重要的注解吧
     */
    @Reference
    private GreetingService greetingService;

    public String sayHello(String name){
        String res = greetingService.sayHello(name);
        return res;
    }
}

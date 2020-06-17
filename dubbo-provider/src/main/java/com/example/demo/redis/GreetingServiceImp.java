package com.example.demo.redis;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.common.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * create by yongli on 2020-05-13 22:51
 * 使用dubbo的@Service将服务暴露出来
 */

@Service
@Component
public class GreetingServiceImp implements GreetingService {
    public static final Logger logger = LoggerFactory.getLogger(GreetingServiceImp.class);
    @Override
    public String sayHello(String name) {

        logger.info("the method is invoker");
        return "Hello,welcome to China," + name;
    }
}

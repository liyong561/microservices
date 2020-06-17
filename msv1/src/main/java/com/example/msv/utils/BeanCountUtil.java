package com.example.msv.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * create by yongli on 2020-06-07 19:28
 * 很好奇，可以看到SpringContext启动后，管理了多少对象
 */

@Component
public class BeanCountUtil implements ApplicationContextAware {

    private static ApplicationContext app;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            app = applicationContext;
    }

    public static void printAllBeanName(){
        String[] beans = app.getBeanDefinitionNames();
        Arrays.sort(beans);
        for(String st:beans){
            System.out.println(st);
        }
    }

    public static ApplicationContext getApp(){
        return app;
    }
}

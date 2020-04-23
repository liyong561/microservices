package com.example.chengduservice.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * create by yongli on 2019-09-26 22:50
 */


@Component
public class SpringUtil implements ApplicationContextAware, EnvironmentAware {

    private static Environment env;

    public static String getProperty(String key){
        return env.getProperty(key);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setEnvironment(Environment environment) {
        injectEnvironment(env);

    }

    public  static void injectEnvironment(Environment env){
        SpringUtil.env = env;
    }


}

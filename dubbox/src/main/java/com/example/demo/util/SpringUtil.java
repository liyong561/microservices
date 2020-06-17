package com.example.demo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * create by yongli on 2020-06-14 17:35
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
    }

    /**
     *
     * @param t
     * @param <T>
     * @return
     * Class
     */
    public  static <T> T  getBean(Class<T> t ) {
       return applicationContext.getBean(t);
    }

}

package com.example.demo.listener;

import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * spring推荐使用java注解，而不是使用配置文件。
 * WebListener就表明其是一个监听器，当其继承了HttpSessionListener就更具体了。
 * 这样就可以了，是只有加上这两个注解才行吗？看来根本不需要WebListener注解，spring会自动创建对象，并且自动注入对象。
 */
@Component
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println(" a http session has been created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("  a http session has been destroyed");

    }
}

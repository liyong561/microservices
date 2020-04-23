package com.example.demo.listener;

import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.core.ApplicationContextFacade;
import org.apache.catalina.core.StandardContext;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 监听servlet的创建和销毁事件。
 */
@Component
@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 实际返回的是ApplicationContextFacade,是StandardContext
        ServletContext servletContext = sce.getServletContext();
        //在应用启动后就开始了，不会等到用户访问才初始化，那么这个servletContext的有哪些属性呢？这些都是可以看到的
        // 给servletContext对象添加了一个Attribute属性，用于整个的应用，所以servletContext又有点像容器，当然这个事件会被监听器监听到。
        // 对象通过自己的方法改变了自己。
        servletContext.setAttribute("userCount",new AtomicInteger());
        System.out.println(servletContext.getAttributeNames());
        //System.out.println(servletContext.getSessionTimeout());这个方法有问题。
        System.out.println("a servlet has created");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("a servlet has been destroyed");

    }
}

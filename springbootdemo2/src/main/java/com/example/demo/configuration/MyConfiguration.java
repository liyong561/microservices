package com.example.demo.configuration;


import com.example.demo.filter.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @configurtion注解有什么用呢？
 * 其实，这个是配合@Bean注解的， 有这个这就标记类，其方法带有@Bean注解的方法，将会使用在spring容器初始化化时
 * 生成相应的bean
 *
 */
@Configuration
public class MyConfiguration implements WebMvcConfigurer {
    @Autowired
    LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/user/sign_up_inter");
    }
}

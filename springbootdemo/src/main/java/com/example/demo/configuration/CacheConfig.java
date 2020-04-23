package com.example.demo.configuration;

import org.aspectj.lang.annotation.Before;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create by yongli on 2019-09-01 19:13
 * 这是一个关于cache的配置
 *  @EnableCaching应该是让应用可以识别@Cachable注解
 *
 */

@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public CacheManager cacheManager(){
        // 可以看到这CM使用了Map。
        // 看源码时我理解了这个东西：xxFactoryBean.setConfigLocation(new ClassPathResource("xx.xml")
        return new ConcurrentMapCacheManager();
    }
}

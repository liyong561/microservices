package com.example.demo.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create by yongli on 2019-09-01 19:40
 * spring in action 真是写的太好了，讲的这么清晰，以前真是不懂，不会读。
 * 现在我要照抄，照抄就能学到很多东西
 */
@Configuration
@EnableCaching
public class RedisCacheConfig {
    /** Redis缓存的加载过程：
     * RedisConnection, -> RedisTemplate -> RedisCacheManager
     *
     */
    public void cacheManager(){

    }

}

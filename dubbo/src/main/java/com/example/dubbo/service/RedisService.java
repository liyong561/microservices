package com.example.dubbo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * template for the redis,it provide sub-api,like opsForValue,opsForList,opsForSet.
 * this is suitable for the redis
 */
@Component
public class RedisService {
    Logger logger= LoggerFactory.getLogger(RedisService.class);
    // not use <String,String>
    // redis直接中配置文件中读取参数
    @Autowired
    private RedisTemplate redisTemplate;

    public  boolean setValue(String key,Object value){

        try{
            redisTemplate.opsForValue().set(key,value);
            return true;
        }catch (Exception e){

        }
        return false;
    }

    // return object,then can change the type;
    public Object getValue(String key){
        Object  value = redisTemplate.opsForValue().get(key);
        if (value == null){
            // no key,so return null
            return null;
        }
        return value;
    }
}

package com.example.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * create by yongli on 2020-05-19 22:41
 */
@Service
public class RedisTemplateService {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    public void setValue(String key, Object value) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();
        operations.set(key, value);
    }

    public Object getValue(String key) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();

        Object obj = operations.get(key);
        return obj;
    }
}

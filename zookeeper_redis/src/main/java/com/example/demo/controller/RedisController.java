package com.example.demo.controller;

import com.example.demo.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    RedisService redisService;

    @GetMapping("/get")
    public Object get(@RequestParam("msg") String msg) {
        return redisService.getValue(msg).toString();
    }

    @GetMapping("/add")
    public Object set(@RequestParam("msg") String msg) {
        return redisService.setValue("msg", msg);
    }
}
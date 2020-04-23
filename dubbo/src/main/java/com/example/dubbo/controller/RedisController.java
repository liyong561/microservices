package com.example.dubbo.controller;

import com.example.dubbo.service.RedisService;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    RedisService redisService;

    @GetMapping("/get")
    public String get(@RequestParam("msg") String msg) {
        return redisService.getValue(msg).toString();
    }

    @GetMapping("/add")
    public Boolean set(@RequestParam("msg") String msg) {
        return redisService.setValue("msg", msg);
    }
}
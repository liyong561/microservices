package com.example.rpcdemo.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * create by yongli on 2020-04-20 21:23
 * 写这样的重复代码，应该是很快的
 * 异步方法在Service中，这是大体的用法是这样
 */
@Service
public class AsynService {

    @Async("threadPool")
    public void test() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }
}

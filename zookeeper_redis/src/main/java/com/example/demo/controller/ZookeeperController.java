package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by yongli on 2020-06-16 22:49
 */
@RestController("/zookeeper")
public class ZookeeperController {

    /**
     * zookeeper中有特殊的符号
     *
     * @return
     */
    @RequestMapping("/{path}")
    public String getData(){
        return "just for test";
    }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;//

/**
 * create by yongli on 2020-05-13 23:03
 * 以简单的方法向外暴露服务
 */

@RestController
public class TestController {

    public String test() {
        return "I come from beijing";
    }
}

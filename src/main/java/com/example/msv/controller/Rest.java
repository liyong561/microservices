package com.example.msv.controller;

import com.example.msv.helloService.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }
}

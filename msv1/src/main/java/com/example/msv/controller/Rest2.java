package com.example.msv.controller;

import com.example.msv.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用于swagger测试")
@RequestMapping("/rest2")
public class Rest2 {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ApiOperation(value = "打招呼用语",notes = "there is no notes")
    public String hello() {
        return helloService.sayHello();
    }
}

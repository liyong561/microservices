package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.ConfigService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api("conifg-client")
public class MyController {

    @Autowired
    ConfigService configService;

    @GetMapping("/name")
    public JSONObject getName(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("this is from cloud","iam-dev");
        jsonObject.put("name",configService.getName());
        jsonObject.put("port",configService.getPort());
        return jsonObject;
    }



}

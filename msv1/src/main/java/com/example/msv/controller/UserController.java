package com.example.msv.controller;

import com.example.msv.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @PostMapping("/login")
    //automatically convert data to my object,so it has the relu,like the name are same
    public Boolean login(@RequestBody UserEntity user){
        logger.info(user.getUserName());
        logger.info(user.getUserName());
        return Boolean.TRUE;

    }
}

package com.example.msv.controller;

import com.example.msv.rabbitmq.HelloReceiver;
import com.example.msv.rabbitmq.HelloSender;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmqpController {

    @Autowired
    HelloSender helloSender;

    @Autowired
    HelloReceiver helloReceiver;

    @GetMapping("/amqp")
    public String amqo(@Param("msg") String msg){
        helloSender.send(msg);
        return msg;
    }
}

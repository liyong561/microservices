package com.example.msv.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * the service for my app
 */
@Component
public class HelloSender {
    // the bean ,the context for me
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(Object obj){
        //just send a simple as a message,no exchange,no route?
        amqpTemplate.convertAndSend("hello.queue1",obj);
    }
}


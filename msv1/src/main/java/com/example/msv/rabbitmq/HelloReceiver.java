package com.example.msv.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * the annotation is powerful,it done many things for programmer
 * the queues value is very important,
 */
@Component
@RabbitListener(queues = "hello.queue1")
public class HelloReceiver {
    Logger logger = LoggerFactory.getLogger(HelloReceiver.class);

    @RabbitHandler
    public void process(Object obj){
        logger.info("I have receive the message");
        logger.info(obj.toString());

    }
}

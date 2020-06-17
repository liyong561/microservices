package com.example.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.example.demo.kafka.MyKafkaConsumer;
import com.example.demo.kafka.MyKafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Caused by: java.lang.ClassNotFoundException: org.apache.curator.RetryPolicy
 * com.alibaba.dubbo.remoting.zookeeper.curator.CuratorZookeeperTransporter.connect
 * 框架还要引入curator
 */
@SpringBootApplication
@EnableDubbo
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
//
//        MyKafkaProducer.send();
//        new Thread(() -> MyKafkaConsumer.consumerMsg()).start();

    }
}

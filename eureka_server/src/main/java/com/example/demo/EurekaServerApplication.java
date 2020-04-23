package com.example.demo;

import com.example.demo.lombokTest.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.logging.Logger;

/**
 * 果然，这个eureka库自带前端
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
static Logger logger;

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        Person p =new Person("liyong",45);
        logger = Logger.getLogger("myLogger");
        logger.info(p.getCountry());
    }

}
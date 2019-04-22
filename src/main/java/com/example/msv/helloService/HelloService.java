package com.example.msv.helloService;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "hello,the spring boot is very convenient for the beginnwer";
    }
}

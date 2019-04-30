package com.example.msv.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "hello,the spring boot is very convenient for the beginnwer";
    }
    public String sayGoodbye(){
        return "Goodbye,when can you find a job?";
    }


}

package com.example.demo.player;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Bottle {
    String name ="ufo";
    public void say(){
        System.out.println("I am "+name);
    }
}

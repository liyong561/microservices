package com.example.demo.player;

import org.springframework.stereotype.Component;

@Component("df")
public class CompactDisc implements SignInterface{
    private String title="Heart Club Band";
    private String artist="liyong";
    public void play(){
        System.out.println("Palying "+title+"by "+artist);
    }
}

package com.example.demo.player;

public class CompactDisc2 implements  SignInterface{
    private String name="Wang";
    private Bottle bottle;
    public CompactDisc2(Bottle bottle){
        this.bottle=bottle;
    }
    public void play(){
        System.out.println("I am "+name);
    }

}

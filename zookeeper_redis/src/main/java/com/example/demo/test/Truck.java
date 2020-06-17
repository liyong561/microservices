package com.example.demo.test;

public class Truck extends Automobile {
    String getName(){
        // there is no field,but I can visit it
        return this.name;
    }
    public Integer getInt(){
         // auto box in
        return this.age;
    }
}

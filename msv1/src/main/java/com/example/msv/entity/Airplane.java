package com.example.msv.entity;

import java.util.Calendar;
import java.util.Date;

/***
 * 将object对象转换为json的工具类使用了object的getter和setter方法，所以说这个方法必须要有。
 * 并且这个类对象并不是交给spring管理
 */
public class Airplane {
    String name;
    float length;
    float width;
    String color;
    int age;
    float speed;

    public Airplane(String name, float length, float width, String color, int age, float speed) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.color = color;
        this.age = age;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * 名字中不带get和set关键字，看其怎么反应
     * @return
     */
    public String hasFeature(){
        return "I'm an airplane,I can transfer people or thing from one place to another";
    }
    public boolean isMoreInfo(){
        /**
         * 根据时间中的某个值来判奇偶来生成,calendar is abstract
         */
        Calendar calendar = Calendar.getInstance();
        int m =calendar.get(Calendar.SECOND);
        return m /2 ==0;
    }
    public boolean showMoreInfo(){
        /**
         * 根据时间中的某个值来判奇偶来生成,calendar is abstract
         */
        Calendar calendar = Calendar.getInstance();
        int m =calendar.get(Calendar.SECOND);
        return m /2 ==0;
    }

}

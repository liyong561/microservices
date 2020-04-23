package com.example.demo.pattern;

/**
 * create by yongli on 2020-03-05 20:08
 * 新闻大事件，事件发生了，会被别的对象监听到，怎么实现这个功能呢？
 * 我们可以看一下，这是一个pojo类
 * 事件升级或降级，每次变化都能被监听到，怎么优雅的实现呢？
 * 通知和监听是两个不同的主体。通知似乎更好理解一些
 * 比如这个事件级别达到5级，就通知？
 * 如果使用监听者模式，这个类就不纯粹了，还是通知机制。
 */

public class BigBang {

    private String event;
    private int level;

    public BigBang(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

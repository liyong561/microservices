package com.example.zoo.enventLoop;

import java.util.EventListener;

/**
 * create by yongli on 2020-03-31 22:54、
 * EventListener，这是一个标记接口，就知道Listener使用有多广泛了
 * 事件源负责产生事件对象，监听者处理事件。
 * 比如说，监听一个人的活动，会有不同的事件，比如吃饭，上班，下班，学习，发明活动等
 * 所以事件源和和事件是不同的概念
 */

public class MyListener implements EventListener {

    // 对事件处理的逻辑
    public void handleEnvent(MyEvent myEvent){

    }
}

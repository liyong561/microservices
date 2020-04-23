package com.example.zoo.enventLoop;

import java.util.EventObject;

/**
 * create by yongli on 2020-03-31 23:21
 */

public class MyEvent extends EventObject {

    // 这个就是事件源
    public MyEvent(Object source) {
        super(source);
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

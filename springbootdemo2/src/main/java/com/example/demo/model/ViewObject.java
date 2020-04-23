package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 这是用来组成一个复杂的集合，比如对于某条商品，评价内容（对象），用户(对象)等。
 */
public class ViewObject {
    private Map<String,Object> objs=new HashMap<>();
    public void set(String key,Object value){
        objs.put(key,value);
    }
    public Object get(String key){
        return objs.get(key);
    }

}

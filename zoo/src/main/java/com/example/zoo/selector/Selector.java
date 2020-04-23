package com.example.zoo.selector;

import java.util.*;

/**
 * create by yongli on 2020-04-02 19:10
 * 监控进入仓库的所有汽车
 * 这个选择器的功能就是选取已经就绪的汽车。 还可以监听汽车什么状态呢？
 * 再给它增加一个状态：故障，这时应该选出来叫给修理工修理。
 */

public class Selector {

    private Map<Truck,Integer>  storehouse =new HashMap<>();

    public boolean add(Truck truck, int status){
         storehouse.put(truck, status);
         return true;
    }

    // 返回的不仅仅是Truck，返回SelectKey，有更多的信息,将用户感兴趣的对象和事件选出来
    public Set<SelectKey> select(){
        Set<SelectKey> selectKeys = new HashSet<>();
        Iterator<Map.Entry<Truck,Integer>> iterator = storehouse.entrySet().iterator(); // 变成一个迭代器
        // 但是这个迭代器的变化会影响到Map
        while (iterator.hasNext()){
            Map.Entry<Truck,Integer> unit = iterator.next();
            Truck truck = unit.getKey();
            Integer status = unit.getValue();
            // 是用户感兴趣的转态
            if(truck.getStatus()== (status & 1) ||  truck.getStatus()== (status & 2) ){
                SelectKey selectionKey = new SelectKey(truck,status);
                selectKeys.add(selectionKey);
                iterator.remove();
            }
        }
        return selectKeys;
    }
}

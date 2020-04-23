package com.example.zoo.selector;

import java.util.Set;

/**
 * create by yongli on 2020-04-02 19:24
 * 负责调度汽车
 *  * 通过实例，理解多路复用
 *  * 注册是由用户自己注册的
 *  * 使用一个什么场景比较合适呢？
 *  *
 *  * 快递物流行业：多辆汽车，一条进出道。比如装货和卸货很耗时。
 *  * 模型抽象：已在仓库的汽车，是否准备好出去，道路上是否有车（假设道路是竞争性资源，道路在同一时间只有一辆汽车）
 */

public class Dispatcher {

    public static void main(String[] args) {
        Selector selector = new Selector();
        for(int i=0;i< 10;i++){
            Truck truck = new Truck(2);
            truck.registry(selector,2);
        }
        // 需要外部去触发这个动作
        Set<SelectKey> keys = selector.select();
        System.out.println(keys.size());
        for(int i=0;i< 11;i++){
            Truck truck = new Truck(2);
            // 要truck对象自己去注册，可以更改方式，把truck丢进一个容器，容器自动去注册（中间代理）;
            // 应为truck可能没有registry这个方法。
            // 就像pipeline其实也是一容器，就是工厂中流水线的一种抽象。
            truck.registry(selector,2);
        }
        Set<SelectKey> keys2 = selector.select(); // =-p
        System.out.println(keys2.size());

    }

    public void in(){
        for(int i=0;i< 10;i++){
            Truck truck = new Truck(2);
        }
    }
}

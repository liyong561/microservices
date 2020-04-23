package com.example.zoo.selector;

/**
 * create by yongli on 2020-04-02 19:55
 * 不直接返回对象，而是返回了更多的东西
 */

public class SelectKey {
    private Truck truck;
    private int status;

    public SelectKey(Truck truck,int status){
        this.truck = truck;
        this.status =  status;
    }


    public  boolean isReady(){
        int flag = status; // 还有其他用途，不能修改它
        // 为操作是一个符号
        return (flag & 1 )== 1;
    }

    public boolean isFault(){
        int flag = status ;
        return flag << 1 == 1;
    }

    public Truck getTruck(){
        return truck;
    }
}

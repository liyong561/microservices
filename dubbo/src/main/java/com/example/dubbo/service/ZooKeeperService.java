package com.example.dubbo.service;

import com.example.dubbo.zoo.MyWatcher;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.springframework.stereotype.Component;

/**
 * 我本地没有开启zookeeper，如何开启呢？
 */
@Component
public class ZooKeeperService {
    static String conn= "127.0.0.1:2181";
    public void get(){
        try {
            ZooKeeper zooKeeper = new ZooKeeper(conn,1000, new MyWatcher());

            zooKeeper.create("/down", "this is my first time to use zookeeper".getBytes(),
                    ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }catch (Exception e){
            e.printStackTrace();
        }
    }
}

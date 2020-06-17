package com.example.demo.zoo;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.stereotype.Service;

/**
 * create by yongli on 2020-06-16 21:39
 * 使用zookeeper的用法
 *
 */
@Service
public class ZookeeperService {
    private static final String  ZOOKEEPER_URL ="127.0.0.1:2181";
    public static CuratorFramework client = CuratorFrameworkFactory.builder()
            .connectString(ZOOKEEPER_URL)
            .sessionTimeoutMs(5000)
            .connectionTimeoutMs(3000)
            .retryPolicy(new ExponentialBackoffRetry(1000,3))
            .build();


    public void test() throws Exception{
        client.start();
        client.getData().forPath("/zoookeeper");

    }

}

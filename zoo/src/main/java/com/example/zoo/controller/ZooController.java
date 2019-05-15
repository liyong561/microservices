package com.example.zoo.controller;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/zoo")
public class ZooController {
    /**
     * Zookeeper info
     * the reference blog: http://www.cnblogs.com/seaspring/p/5536338.html
     */
    private static final String ZK_ADDRESS = "127.0.0.1:2181";
    private static final String ZK_PATH = "/zk";
    private static final String NEW_ZK_PATH = "/zk1";
    static Logger logger = LoggerFactory.getLogger(ZooController.class);
    // 1.Connect to zk

    static CuratorFramework client = CuratorFrameworkFactory.newClient(
            ZK_ADDRESS,
            new RetryNTimes(10, 5000)
    );
    static {
        // in static block
        client.start();
        logger.info("zk client start successfully!");
    }


    @RequestMapping("/add")
    public String addMessage(@RequestParam("msg") String msg) {
        // 2.Client API test
        // 2.1 Create node

        try {
            client.create().
                    creatingParentsIfNeeded().
                    forPath(NEW_ZK_PATH, msg.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "OK";
    }

        @RequestMapping("/get")
        public String getMessage() {
            Object data = null;
            try {
                logger.info(client.getChildren().forPath("/").toString());
                data = client.getData().forPath(ZK_PATH);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return data.toString();
        }
        /*
        // 2.2 Get node and data
        print("ls", "/");
        print(client.getChildren().forPath("/"));
        print("get", ZK_PATH);
        print(client.getData().forPath(ZK_PATH));

        // 2.3 Modify data
        String data2 = "world";
        print("set", ZK_PATH, data2);
        client.setData().forPath(ZK_PATH, data2.getBytes());
        print("get", ZK_PATH);
        print(client.getData().forPath(ZK_PATH));

        // 2.4 Remove node
        print("delete", ZK_PATH);
        client.delete().forPath(ZK_PATH);
        print("ls", "/");
        print(client.getChildren().forPath("/"));

         */
}

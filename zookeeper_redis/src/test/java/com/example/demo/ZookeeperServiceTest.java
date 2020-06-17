package com.example.demo;

import com.example.demo.zoo.ZookeeperService;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.TreeCache;
import org.apache.curator.framework.recipes.cache.TreeCacheEvent;
import org.apache.curator.framework.recipes.cache.TreeCacheListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * create by yongli on 2020-06-16 22:58
 * 代码千千万，关键还是了解他的模式，也就是编程范数，化多为少
 * 这是Zookeeper的基本用法，要举一反三，向当年做高考数学题一样。
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboApplication.class)
public class ZookeeperServiceTest {
    public static final Logger logger = LoggerFactory.getLogger(ZookeeperServiceTest.class);

    // 添加监听器
    @Test
    public void test() {
        String path = "/zookeeper";
        CuratorFramework client = ZookeeperService.client;
        client.start();
        TreeCache treeCache = new TreeCache(client, path);
        // 要能够合理的监听到TreeEvent
        TreeCacheListener cacheListener = (CuratorFramework curatorFramework, TreeCacheEvent treeCacheEvent) -> {
            switch (treeCacheEvent.getType()) {
                case NODE_ADDED:
                    logger.info("node add");
                    ChildData childData = treeCacheEvent.getData();
                    String subPath = childData.getPath();
                    byte[] bytes = childData.getData();
                    String data = new String(bytes);
                    logger.info("the data is :{}", data);
                    break;
                case NODE_REMOVED:
                    logger.info("node removed ");
                    break;
                case NODE_UPDATED:
                    logger.info("node update");
                    break;
                default:
                    break;
            }
        };

        treeCache.getListenable().addListener(cacheListener);
    }


}

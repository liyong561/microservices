package com.example.dubbo.zoo;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyWatcher implements Watcher {
    Logger logger = LoggerFactory.getLogger(MyWatcher.class);
    @Override
    public void process(WatchedEvent watchedEvent) {
        logger.info("dfd"+watchedEvent.getPath());
    }
}

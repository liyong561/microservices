package com.example.dubbo.zoo;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用和框架软件相同的软件，可以直接使用其提供的代码，无缝对接
 */
public class MyWatcher implements Watcher {
    Logger logger = LoggerFactory.getLogger(MyWatcher.class);

    @Override
    public void process(WatchedEvent watchedEvent) {
        logger.info("dfd" + watchedEvent.getPath());
    }
}

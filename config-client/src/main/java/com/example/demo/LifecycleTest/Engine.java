package com.example.demo.LifecycleTest;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;

/**
 * create by yongli on 2020-03-11 20:37
 */

public class Engine  implements Lifecycle {
    @Override
    public void addLifecycleListener(LifecycleListener lifecycleListener) {

    }

    @Override
    public LifecycleListener[] findLifecycleListeners() {
        return new LifecycleListener[0];
    }

    @Override
    public void removeLifecycleListener(LifecycleListener lifecycleListener) {

    }

    @Override
    public void init() throws LifecycleException {

        System.out.println("发动机通电");

    }

    @Override
    public void start() throws LifecycleException {
        System.out.println("发动机启动");
    }

    @Override
    public void stop() throws LifecycleException {
        System.out.println("发动机停止");
    }

    @Override
    public void destroy() throws LifecycleException {

    }

    @Override
    public LifecycleState getState() {
        return null;
    }

    @Override
    public String getStateName() {
        return null;
    }
}

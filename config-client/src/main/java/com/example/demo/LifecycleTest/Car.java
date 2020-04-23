package com.example.demo.LifecycleTest;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;

/**
 * create by yongli on 2020-03-11 20:41
 *
 * 这三个对象在行动上是依次启动的，故都可以这么来
 */

public class Car implements Lifecycle {

    private Engine engine;

    public Car(){

    }
    public Car(Engine engine){
        this.engine =engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

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

    }

    @Override
    public void start() throws LifecycleException {
        engine.start();
        System.out.println("汽车启动了");
    }

    @Override
    public void stop() throws LifecycleException {
        engine.stop();
        System.out.println("车停了");
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

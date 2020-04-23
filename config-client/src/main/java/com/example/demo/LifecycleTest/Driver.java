package com.example.demo.LifecycleTest;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;

/**
 * create by yongli on 2020-03-11 20:41
 */

public class Driver implements Lifecycle {

    private Car car;

    public Driver() {
    }

    public Driver(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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
        System.out.println("热身了");
    }

    @Override
    public void start() throws LifecycleException {
        car.start();
        System.out.println("我要开始了");
    }

    @Override
    public void stop() throws LifecycleException {
        car.stop();
        System.out.println("停车了，大家可以下车了");
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

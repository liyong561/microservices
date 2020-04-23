package com.example.zoo.useFuture;

import com.example.zoo.entity.Tigger;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * create by yongli on 2020-03-30 23:28
 * future的核心是不是call方法？
 * Future的用法和Runnable的用法应该是相似的
 * FutureTask是Runnable接口和Furture接口的实现类，java标准库
 * 还有Callable对象
 *
 *
 */

public class FutureTest {

    public static void main(String[] args) throws Exception {
        // 为甚么这个不可以省？
        Callable<Tigger> callabe2 = new Callable<Tigger>() {
            @Override
            public Tigger call() throws Exception {
                return null;
            }
        };
        test(332.323);
        test3(332.323);
        System.out.println("I am in behind");
    }

    public static void test(Double d1) throws Exception {
        Double d2 = 32.23d;
        Callable<Double> solve = new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return null;
            }
        };


        // 比如这是一个方程根的数值解法，我怎么传入参数？
        // 用函数来包装，传入外部参数
        Callable<Double> solve2 = () -> d1 * d2;

        Callable<Double> solve3 = () -> {
            Double d3 = d1 * d2;
            Thread.sleep(10000); // 为什么可以不捕获异常了？默认抛出Exception
            return d3;
        };
        Double d4 = solve3.call(); // 看事实可以看出来,Callable只是一个普通的接口，并没有异步
        System.out.println(d4);
    }

    public static void test2(Double d1) throws Exception {
        Double d2 = 32.23d;
        Callable<Double> solve3 = () -> {
            Double d3 = d1 * d2;
            Thread.sleep(1000); // 为什么可以不捕获异常了？默认抛出Exception
            return d3;
        };
        Future<Double> future = new FutureTask<>(solve3);
        Double d4 = future.get(); // 这个使用get()方法，但是他没有得到执行-_-
        System.out.println(d4);
    }

    public static void test3(Double d1) throws Exception {
        Double d2 = 32.23d;
        Callable<Double> solve3 = () -> {
            Double d3 = d1 * d2;
            Thread.sleep(1000); // 为什么可以不捕获异常了？默认抛出Exception
            return d3;
        };
        FutureTask<Double> future = new FutureTask<>(solve3);
        // Executors.
        Thread f = new Thread(future);
        f.start(); // 要放在线程中执行，但是这个方法和其他方法还是同步的，要等到get方法返回结果
        System.out.println("the future task is running");
        Thread.sleep(1000);  //可以做会其他的事情,同时FutureTask也在执行
        System.out.println("wake up");
        Double d4 = future.get(); // 会阻塞
        System.out.println("the future task is ending");
        System.out.println(d4);
    }
}

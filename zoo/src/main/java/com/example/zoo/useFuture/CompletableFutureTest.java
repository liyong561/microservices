package com.example.zoo.useFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/**
 * create by yongli on 2020-03-31 22:00
 * CompletableFuture<T>: 实现异步回调。FutureTask的get方法还是阻塞的
 * 可以看这个源码，洋洋洒洒两千行，非常难懂，那就学会怎么用吧
 * 回调接口，大量使用了函数式编程
 * 还有一个RecursiveTask类，使用工具窃取算法，用于将大任务化小
 * CountDownLatch
 */

public class CompletableFutureTest {

    public static void main2(String[] args) throws Exception{

        runAsync();
        supplyAsync();
        supplyAsyncCall();
    }
    //无返回值
    public static void runAsync() throws Exception {
        // runAsync方法返回就可以了，但是好像不能传对象。
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println("run end ...");
            // 没有return语句，使用Void
        });

        future.get();
    }

    //有返回值
    public static void supplyAsync() throws Exception {
        // 并没有看到在哪里回调啊，这和FutureTask没有什么区别啊
        CompletableFuture<Long> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println("run end ...");
            return System.currentTimeMillis();
        }); // 这只是定义，没有运行

        long time = future.get();
        System.out.println("time = "+time);
    }


    //有返回值
    public static void supplyAsyncCall() throws Exception {
        CompletableFuture<Long> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("run end ...");
            return System.currentTimeMillis();
        });
        future.whenComplete(new BiConsumer<Long, Throwable>() {
            // BiConsumer的作用
            @Override
            public void accept(Long aLong, Throwable throwable) {
                // 这个才能体会到回调的作用
                System.out.println("the method is finished, please go to sleep" +
                        ",everyone!");
            }
        });

        long time = future.get();
        System.out.println("time = "+time);
    }

}

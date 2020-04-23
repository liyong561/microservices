package com.example.rpcdemo.config;

import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * create by yongli on 2020-04-20 21:09
 * 这使用这个异步线程池
 * 我之前看过别人石红@Asyn的用法，你应该很快学会的，而不是在看博客
 * 配置一个线程池，以供异步方法使用
 * 在spring中使用的Asyn还用来哪些包和类呢？
 */

@Configuration
public class ThreadPool implements AsyncConfigurer {

    /**
     * ThreadPoolExecutor(int corePoolSize,
     *                               int maximumPoolSize,
     *                               long keepAliveTime,
     *                               TimeUnit unit,
     *                               BlockingQueue<Runnable> workQueue)
     * @return
     */
    @Override
    public Executor getAsyncExecutor() {
//        Executor executor = new ThreadPoolExecutor(16,);
        // 本质上是对ThreadPoolExecutor的封装
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor(); // 这个类的构造方法好些更简单
        executor.setCorePoolSize(16);
        executor.setMaxPoolSize(32);
        executor.setThreadNamePrefix("async");
        return executor;
    }
}

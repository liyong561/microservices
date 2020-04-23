package com.example.zoo.enventLoop;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * create by yongli on 2020-03-30 21:57
 * 实现多个对象的非阻塞处理
 * 怎么实现监听
 * 程序中，状态要改变，肯定要得到cpu的执行。
 * 单线程: 不能在方法返回后，方法还可以执行。
 * 如果是单线程，根本调度不起来。
 */

public interface Student {

    void doBeforeWrite(); // 写之前要完成的工作,doBefore应该是其他线程调用的。

    void doBeforeRead(); // 需要在对象中有一个标志位，应为函数是无状态的

    void write(OutputStream os); // 写

    boolean canWrite();

    void read(InputStream is); // 读操作，需要花很多时间，

    boolean canRead();  // 检查它们的状态。
}

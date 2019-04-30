package com.example.msv.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Aspect3 {

    @Before("execution (* com.example.msv.controller.Rest.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        // 可以看到，连接点基本是一个方法，这样可以获得方法的信息。
        String methodName = joinPoint.getSignature().getName();

    }
//@After
/* 这种注解要不得吧？
    @After("execution (* *.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method name:" + methodName + " ends");
    }
    //@AfterRunning: 返回通知
*/
}

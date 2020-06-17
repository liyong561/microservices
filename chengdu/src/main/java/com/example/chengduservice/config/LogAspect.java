package com.example.chengduservice.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * create by yongli on 2020-03-18 21:31
 * 定义切点
 * 这个aop肯定会降低程序的性能，但是很方便。
 * 除了execution, annotation也很好好用
 */

@Aspect
@Component
public class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // 切点是去匹配方法
    // .* 是以及，方法，类，包
    // 方法要求是没有参数的
    @Pointcut("execution(public * com.example.chengduservice.controller..*.*())")
    private void log() {
    }

    @Pointcut("execution(public * com.example.chengduservice.controller..*.*(..))")
    private void log2() {
    }


    // 更距point做特殊化处理
    @Before("log()")
    public void beforeRequest(JoinPoint point) {
        // spring中全局的方法访问
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String url = request.getRequestURI();
        System.out.println("the url is :" + url);

        String ip = request.getRemoteAddr();
        System.out.println("the remote address is :" + ip);

        // point怎么用呢？
        String sig = point.getSignature().getName();
        System.out.println("the signature of the request:" + sig);
    }

    /**
     * 被代理的对象无感知
     * 使用切面记录每个方法的执行时间。
     *
     * @param point
     */
    @Around("log2()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        long t1 = System.currentTimeMillis();
        point.proceed();
        long duration = System.currentTimeMillis() - t1;

        logger.info("the duration is : {}ms",duration);
    }
}

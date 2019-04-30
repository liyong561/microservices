package com.example.msv.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Aspect
@Component
public class ControllerAspect2 {
    static Logger logger = LoggerFactory.getLogger(ControllerAspect2.class);
    //有注解，所以特殊，哈哈哈

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RestController)")
    public void pointAnn(){
        //该方法就是一个标识方法，为pointcut提供一个依附的地方
        logger.info("the method in rest has been invoke ");
    }
    @Pointcut("execution(* com.example.msv.controller.Rest.hello(..))")
    public void pointExe(){}
    // around的方式要慎用，shutdown时controller方法才返回。奇怪。
    @Before("pointExe()")
    public void aop1( ){

        logger.info("the method say has been invoke");
    }

}

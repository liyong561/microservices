package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 将横切关注点集中在一起，在该案例中，切入concert
 * 切面包基本都在这里
 *
 */
@Aspect
public class AspectTest {
    @Before("execution( ** concert.Performance.perform(..)")
    public void beforePerformace(){

    }
}

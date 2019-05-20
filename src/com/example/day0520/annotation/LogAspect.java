package com.example.day0520.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.example.day0520.annotation.HiMe.*(..))")
    public void point() {

    }

    @Pointcut("execution(* com.example.day0520.annotation.HelloDemo.*(..))")
    public void point1() {

    }

    @Before("point()")
    public void before() {
        System.out.println("it's before");
    }

    @Before("point1()")
    public void before1() {
        System.out.println("it's before1");
    }

    @AfterReturning("point()")
    public void after() {
        System.out.println("it's after");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("it's around1");
        joinPoint.proceed();
        System.out.println("it's around2");
    }
}

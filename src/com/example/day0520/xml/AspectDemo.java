package com.example.day0520.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectDemo {
    public void start() {
        System.out.println("it's start");
    }

    public void end() {
        System.out.println("it's end");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("it's around1");
        joinPoint.proceed();
        System.out.println("it's around2");
    }
}

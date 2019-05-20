package com.example.day0520.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application.xml");
        TestAspect ta = (TestAspect) ac.getBean("testAspect");
        ta.say();
    }
}

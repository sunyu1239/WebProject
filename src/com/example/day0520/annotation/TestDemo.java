package com.example.day0520.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        HiMe hi = (HiMe) ac.getBean("hiMe");
        hi.dod();
        HelloDemo hd = (HelloDemo) ac.getBean("helloDemo");
        hd.sayGood();
    }
}

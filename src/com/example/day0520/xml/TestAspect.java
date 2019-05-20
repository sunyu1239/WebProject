package com.example.day0520.xml;

import org.springframework.stereotype.Component;

@Component("testAspect")
public class TestAspect {
    public void say() {
        System.out.println("do something like this");

    }

}

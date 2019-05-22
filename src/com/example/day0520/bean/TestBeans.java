package com.example.day0520.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        User u = (User) ac.getBean("user");
        System.out.println(u.getName());
        System.out.println(u.getAge());
        for (String s : u.getAddress()) {
            System.out.println(s);
        }
        for (Lesson les : u.getLessonList()) {
            System.out.println(les.getId() + ":" + les.getName());
        }
        for (Person p : u.getPersonSet()) {
            System.out.println(p.getAge() + ":" + p.getName());
        }
        for (String key : u.getMap().keySet()) {
            System.out.println(key + ":" + u.getMap().get(key).getId() + ":" + u.getMap().get(key).getName());
        }
    }

}

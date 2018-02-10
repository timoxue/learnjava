package com.timothy.spring.aspectj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timothy.spring.aop.*;
public class Client {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        People student = (People)factory.getBean("student");
        student.say();
        
    }
}
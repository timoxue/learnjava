package com.timothy.spring.aop;

class Dog implements Animal {
    public void bark() {
        System.out.println("The dog is braking!");
    }

    public void run() {
        System.out.println("The dog is running!");
    }
}
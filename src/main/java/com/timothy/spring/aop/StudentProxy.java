package com.timothy.spring.aop;

class StudentProxy {
    public static void main(String[] args){
        People student = new Student();
        Animal dog = new Dog();
        CommonInvocationHandler proxyHandler = new CommonInvocationHandler();
        People proxy = (People)proxyHandler.getProxy(student);
        proxy.say();
        proxy.run();

        Animal aProxy = (Animal)proxyHandler.getProxy(dog);


        aProxy.bark();
    }
}
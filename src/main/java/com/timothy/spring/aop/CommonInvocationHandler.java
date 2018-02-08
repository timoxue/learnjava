package com.timothy.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

class CommonInvocationHandler implements InvocationHandler {
    private Object obj;

    public Object getProxy(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        check();
        System.out.println("proxy name is : " + proxy.getClass().getName());
        System.out.println("call method name is :" + method.getName());

        Object object = method.invoke(this.obj, args);
        return object;
    }

    public void check() {
        System.out.println("------check------");
    }
}
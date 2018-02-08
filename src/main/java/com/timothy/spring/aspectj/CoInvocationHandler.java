package com.timothy.spring.aspectj;

import org.aspectj.lang.annotation.*;

@Aspect
public class CoInvocationHandler {
    @Pointcut("execution(* say*(..)) || execution(* run*(..))")
    private void method() {
        System.out.println("--------method--------");
    }

    @Before("method()")
    private void check(){
        System.out.println("---------check--------");
    }
}
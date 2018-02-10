package com.timothy.chapter1.t7;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin==" + mythread.isAlive());
		mythread.start();
		mythread.sleep(1000);
		System.out.println("end==" + mythread.isAlive());
	}

}

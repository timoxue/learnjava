package com.timothy.chapter1.t8;

public class Run1 {
	public static void main(String[] args) {
		MyThread1 mythread = new MyThread1();
		System.out.println("begin =" + System.currentTimeMillis());
		mythread.run();
		System.out.println("end =" + System.currentTimeMillis());
	}
}

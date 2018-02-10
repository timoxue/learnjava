package com.timothy.chapter1.s2;

public class Run {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("running end");
	}
}

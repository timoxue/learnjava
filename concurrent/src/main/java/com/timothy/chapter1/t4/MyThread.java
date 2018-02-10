package com.timothy.chapter1.t4;

public class MyThread extends Thread {
	private int count = 5;
	@Override
	synchronized public void run() {
		super.run();
		count --;
		System.out.println("let " + this.currentThread().getName() + " calculate, count=" + count);
	}

}

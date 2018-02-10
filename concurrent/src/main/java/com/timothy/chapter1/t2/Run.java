package com.timothy.chapter1.t2;

public class Run {
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("running end!");
	}
}

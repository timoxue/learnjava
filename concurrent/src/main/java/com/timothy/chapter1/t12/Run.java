package com.timothy.chapter1.t12;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("is stoped 1?=" + thread.interrupted());
			System.out.println("is stoped 2?=" + thread.interrupted());
		} catch(InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	} 
}

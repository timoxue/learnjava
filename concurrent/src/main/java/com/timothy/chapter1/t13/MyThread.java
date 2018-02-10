package com.timothy.chapter1.t13;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 50000; i ++) {
			if (this.interrupted()) {
				System.out.println("It is stopped!I am out!");
				break;
			}
			System.out.println("i=" + (i+1));
		}
	}

}

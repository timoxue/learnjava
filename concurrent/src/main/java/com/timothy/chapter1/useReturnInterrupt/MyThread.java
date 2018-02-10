package com.timothy.chapter1.useReturnInterrupt;

public class MyThread extends Thread {
	@Override
	public void run() {
		while(true) {
			if(this.isInterrupted()) {
				System.out.println("Stopped!");
				return;
			}
			System.out.println("timer=" + System.currentTimeMillis());
		}
	}
}

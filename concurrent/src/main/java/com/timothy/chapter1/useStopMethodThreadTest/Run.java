package com.timothy.chapter1.useStopMethodThreadTest;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5000);
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

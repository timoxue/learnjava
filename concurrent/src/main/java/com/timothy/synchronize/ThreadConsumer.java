package com.timothy.synchronize;

public class ThreadConsumer extends Thread {
	private Service<String> service;
	
	public ThreadConsumer(Service<String> service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				service.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

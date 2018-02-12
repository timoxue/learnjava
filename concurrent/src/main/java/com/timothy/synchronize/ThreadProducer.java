package com.timothy.synchronize;

public class ThreadProducer extends Thread {
	private Service<String> service;
 
	public ThreadProducer(Service<String> service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				service.put("a");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

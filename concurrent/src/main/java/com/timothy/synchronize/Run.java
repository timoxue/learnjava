package com.timothy.synchronize;

public class Run {
	public static void main(String[] args) {
		Service<String> service = new Service<String>(10);
		ThreadProducer producer = new ThreadProducer(service);
		ThreadConsumer consumer = new ThreadConsumer(service);
		
//		ThreadProducer[] pthreads = new ThreadProducer[3];
//		ThreadConsumer[] cthreads = new ThreadConsumer[3];
//		for(int i = 0; i < 3; i ++) {
//			pthreads[i] = new ThreadProducer(service);
//			pthreads[i].setName("producer" + (i +1));
//			
//			cthreads[i] = new ThreadConsumer(service);
//			cthreads[i].setName("consumer" + (i + 1));
//			
//		}
		producer.start();
		consumer.start();
		
	}
}

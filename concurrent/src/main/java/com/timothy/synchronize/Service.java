package com.timothy.synchronize;

import java.util.LinkedList;

public class Service<T> implements BlockQueue<T> {
	private int queueSize = 10;
	private final LinkedList<T> queue = new LinkedList<T>();
	private final Object lock = new Object();

	public Service(int size) {
		if(size < 1) {
			throw new IllegalArgumentException("queue size must be positive!");
		}
		this.queueSize = size;
	}
	
	public void put(T data) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " in -->" + data.toString());
		synchronized(lock) {
			while(queueSize <= queue.size()) {
				lock.wait();
			}
			queue.addFirst(data);

			lock.notifyAll();
		}
	}
	
	public T take() throws InterruptedException {
		synchronized(lock) {
			while(queue.size() <= 0) {
				lock.wait();
			}
			T data = queue.removeLast();
			System.out.println(Thread.currentThread().getName() + " out -->" + data.toString());
			lock.notifyAll();
			return data;
		}
	}
}

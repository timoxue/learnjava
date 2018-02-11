package com.timothy.synchronize;

interface BlockQueue<T> {
	void put(T data) throws InterruptedException;
	T take() throws InterruptedException;
}

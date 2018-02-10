package com.timothy.chapter1.t12;

public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("is stopped 1?=" + Thread.interrupted());
		System.out.println("is stopped 2?=" + Thread.interrupted());
		System.out.println("end!");
	}
}

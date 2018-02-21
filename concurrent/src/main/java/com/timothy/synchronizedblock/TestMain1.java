package com.timothy.synchronizedblock;

public class TestMain1 {
	static TestMain1 objMain = new TestMain1();
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				TestMain1.method2();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				TestMain1 obj = new TestMain1();
				obj.method1();
			}
		}).start();
	}
	
	public static void method2() {
		synchronized(TestMain1.class) {
			System.out.println("method2......");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("method2 ..... out");
		}

	}
	
	public void method1() {
		synchronized(TestMain1.class) {
			System.out.println("method1 .... working");
		}
	}
}

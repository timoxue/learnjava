package com.timothy.chapter1.stopThrowLock;

public class SynchronizedObject {
	private String username = "a";
	private String password = "aa";
	public String getUserName( ) {
		return username;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password =  password;
	}
	
	synchronized public void printString(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(10000);
			this.password = password;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

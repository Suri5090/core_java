package com.practice;

public class ExceptionDemo{

	public static void main(String args[]) {
	
		ExceptionDemo demo = new ExceptionDemo();
		demo.doStuff();
	}
	
	public void doStuff(){
		doMoreStuff();
	}
	
	public void doMoreStuff() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
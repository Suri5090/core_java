package com.practice;

public class ExceptionDemo{

	public static void main(String args[]) throws InterruptedException {
	
		ExceptionDemo demo = new ExceptionDemo();
		demo.doStuff();
	}
	
	public void doStuff() throws InterruptedException{
		doMoreStuff();
	}
	
	public void doMoreStuff() throws InterruptedException {
		Thread.sleep(5000);
	}
}
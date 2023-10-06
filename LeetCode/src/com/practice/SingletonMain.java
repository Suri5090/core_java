package com.practice;

class SingletonDemo {

	private static SingletonDemo single = new SingletonDemo();
	
	public String s;
	
	private SingletonDemo() {
		s = "SURESH";
	}
	
	public static SingletonDemo getInstance() {
		return single;
	}
}

public class SingletonMain{
	
	public static void main(String[] args) {
		
		SingletonDemo x = SingletonDemo.getInstance();
		SingletonDemo y = SingletonDemo.getInstance();
		SingletonDemo z = SingletonDemo.getInstance();
		
		
		System.out.println((x.s).toLowerCase());
		System.out.println(y);
		System.out.println(z);
	}
}

package com.java8code;

public class LambdaFunction2 {

	public static void main(String[] args) {
		
		Addition ad = (a,b)-> a+b;
		System.out.println(ad.add(4, 5));
		
		ad.m1();
		
		Addition.m2();
	}
	
}

@FunctionalInterface
interface Addition{
	
	public int add(int a, int b);
	
	default void m1() {
		System.out.println("Welcome");
	}
	
	static void m2() {
		System.out.println("static method");
	}
}
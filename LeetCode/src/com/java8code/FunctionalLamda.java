package com.java8code;

@FunctionalInterface
interface Fasak{
	
	public void m1();
}

public class FunctionalLamda{

	public static void main(String[] args) {
		Fasak t = () -> System.out.println("Hello World");
		t.m1();
	}
}

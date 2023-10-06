package com.practice;

public class ImmutableDemo {

	public static void main(String[] args) {
				
		String str = "Suresh";
		System.out.println(str.hashCode());
		str = "Ramesh";
		System.out.println(str.hashCode());
	}
}
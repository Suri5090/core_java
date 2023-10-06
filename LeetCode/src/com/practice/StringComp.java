package com.practice;

public class StringComp {

	public static void main(String[] args) {

		String s1 = new String("Suresh");
		String s2 = new String("Suresh");
		String s3 = "Suresh";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}

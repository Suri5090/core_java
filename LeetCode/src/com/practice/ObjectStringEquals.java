package com.practice;

public class ObjectStringEquals {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.equals(obj2));
		
		String str1 = new String("Suresh");
		String str2 = new String("Suresh");
		String str3 = str2;
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		StringBuffer sb1 = new StringBuffer("Suresh");
		StringBuffer sb2 = new StringBuffer("Suresh");
		System.out.println(sb1.equals(sb2));
	}
}

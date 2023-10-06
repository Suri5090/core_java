package com.practice;

import java.util.Arrays;

public class SmallestNum {

	public static void main(String[] args) {
		
		int n = 301;
		
		String str = String.valueOf(n);
		
		char[] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		String sortString = new String(ch);
		
		System.out.println(sortString);
	}
}

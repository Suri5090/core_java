package com.java8code;

import java.util.Arrays;

public class FindElementInArray {

	public static void main(String[] args) {
		
		char[] chrArr = {'a','c','d','y','e','q','b'};
		int index = Arrays.binarySearch(chrArr, 0, chrArr.length-1, 'q');
		System.out.println(index);
	}
}

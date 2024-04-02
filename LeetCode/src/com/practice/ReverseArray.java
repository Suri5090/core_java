package com.practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {2, 11, 5, 10, 8};
		int end = arr.length-1;
		int start=0, temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
}

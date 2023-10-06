package com.practice;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		
		int n = arr.length + 1;
		
		int totalSum = n*(n+1)/2;
		
		int currentSum = 0;
		
		for(int value : arr) {
			currentSum+=value;
		}
		System.out.println("Missing number: "+ (totalSum-currentSum));
	}
}

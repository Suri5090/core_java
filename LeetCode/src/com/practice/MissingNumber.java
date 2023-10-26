package com.practice;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 6, 3, 7, 8};

		int miss = findMissingNumber(arr, arr.length+1);

		System.out.println("Missing number: "+ miss);
	}

	private static int findMissingNumber(int[] arr, int n) {

		int total= 1;
		for(int i=2; i<=arr.length+1; i++){
			total = total + i;
			total = total - arr[i-2];
		}
		return total;
	}
}

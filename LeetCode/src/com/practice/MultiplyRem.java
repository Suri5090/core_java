package com.practice;

import java.util.Arrays;

//int[] out = {160, 240, 60, 48};
public class MultiplyRem {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 8, 10};
		int[] out = new int[4];

		int n = 1;

		for(int i=0; i<arr.length; i++){
			n = n * arr[i];
		}	
		for(int j=0; j<arr.length; j++){
			out[j] = n/arr[j];
		}
		System.out.println(Arrays.toString(out));
	}
}

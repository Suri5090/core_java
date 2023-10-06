package com.practice;

import java.util.Arrays;

public class DiagonalArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int n = arr.length;
		
		int[] res = diagonalArrayElements(arr, n);
		System.out.println(Arrays.toString(res));
	}

	private static int[] diagonalArrayElements(int[][] arr, int n) {
		
		int[] res = new int[n];
		
		int k=0;
		int j = n-1;
		for(int i=0; i<n; i++) {
			while(j>=0) {
				res[k] = arr[i][j];
				k++;
				j--;
				break;
			}
		}
		return res;
	}
}

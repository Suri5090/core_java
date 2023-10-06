package com.practice;

import java.util.Arrays;

public class RotateDemo {

	public static void main(String[] args) {
		
		int[] arr = {21,54,11,35,4,18};
		
		int n = arr.length, rotate=4;
		
		int[] res;
		
		for(int i=1; i<rotate; i++)
		{
			res = new int[n];
			int j = 1;
			for(int k=0; k<n; k++)
			{
				if(k==n-1) {
					res[0]=arr[k];
				}
				else {
					res[j]=arr[k];
					j++;
				}
			}
			arr = res;
		}
		System.out.println(Arrays.toString(arr));
	}
}

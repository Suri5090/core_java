package com.practice;

import java.util.Arrays;
public class SecondHighestNum {

	public static void main(String[] args) {
		
		int[] arr = {6, 12, 23, 14, 19, 13, 4, 1, 17};

		Arrays.sort(arr);

		System.out.println("Second Largest -1: "+arr[arr.length-2]);
		
		int element = Arrays.stream(arr).sorted().limit(arr.length-1).skip(arr.length-2).findFirst().orElse(0);

		System.out.println("Second Largest -2: "+element);

		System.out.println("Second Largest -3: "+getSecondLargest(arr));

	}

	private static int getSecondLargest(int[] arr)
	{
		int high = 0, high2 = 0;
		for(int i : arr) {
			if(high < i)
			{
				high2 = high;
				high = i;
			}
			else if(high2 < i) {
				high2 = i;
			}
		}
		return high2;
	}
}

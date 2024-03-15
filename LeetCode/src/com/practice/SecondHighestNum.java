package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SecondHighestNum {

	public static void main(String[] args) {
		
		Integer[] arr = {6, 12, 23, 14, 19, 13, 17};
		
		List<Integer> arrList = Arrays.asList(arr);
		
		int n = arrList.size();
		
		Collections.sort(arrList);
		
		System.out.println(arrList.get(arrList.size()-2));
		
		arrList.stream().sorted().limit(n-1).skip(n-2).forEach(System.out::println);

		System.out.println("Second Largest: "+getSecondLargest(arr));

	}

	private static int getSecondLargest(Integer[] arr) 
	{
		int high = 0, high2 = 0;

		for(int i:arr) {

			if(arr[i] > high)
			{
				high2 = high;
				high = arr[i];
			}
			else if(arr[i] > high2) {
				high2 = arr[i];
			}
		}
		return high2;
	}
}

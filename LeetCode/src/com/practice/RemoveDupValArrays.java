package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupValArrays {

	public static void main(String[] args) {
		
		int arr[] = {10, 30, 20, 10, 15, 20, 35, 30};
		
		System.out.println("Using Streams");
		
		int[] unqArr = Arrays.stream(arr).distinct().toArray();
		
		Arrays.stream(unqArr).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Using Set Keyword");
		
		Set<Integer> remDupSet = new HashSet<Integer>();
		
		for(int i =0; i<arr.length; i++) {
			
			remDupSet.add(arr[i]);
		}
		System.out.println(remDupSet);
	}
}

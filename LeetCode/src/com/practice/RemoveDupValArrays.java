package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupValArrays {

	public static void main(String[] args) {
		
		Integer[] arr = {10, 30, 20, 10, 15, 20, 35, 30};
		
		System.out.println("Using Streams");

		Integer[] unqArr = Arrays.stream(arr).distinct().toArray(Integer[]::new);

		System.out.println(Arrays.toString(unqArr));

		System.out.println();

		System.out.println("Using Set Keyword");

		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		Integer[] remDupSet = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(remDupSet));
	}
}

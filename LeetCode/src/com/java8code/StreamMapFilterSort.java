package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilterSort {

	public static void main(String[] args) {
		
		List<Integer> arrList = Arrays.asList(4,2,5,7,3,7,8,2,1);
		List<Integer> mapList = arrList.stream().map(i-> i*i).collect(Collectors.toList());
		System.out.println(mapList);
		
		System.out.println();
		List<Integer> filterList = arrList.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(filterList);
		System.out.println();
		
		List<Integer> sortedArray = arrList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedArray);
		System.out.println();
		
		List<Integer> customSort = arrList.stream().sorted((i, j)-> j.compareTo(i)).collect(Collectors.toList());
		System.out.println(customSort);
	}
}

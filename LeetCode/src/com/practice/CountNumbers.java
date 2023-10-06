package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumbers {

	public static void main(String[] args) {
		
		//Integer[] arr = {4,4,4,6,4,5,8,8,5};
		
		Integer[] arr = {4,4,5,6,7,8,8};
		
		List<Integer> arrList = Arrays.asList(arr);
		
		Map<Integer, Long> mapArr = arrList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapArr);
		
		arrList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e -> e.getValue() > 1)
		.forEach(System.out::println);
	}
}

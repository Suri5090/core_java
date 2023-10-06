package com.java8code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupElements {

	public static void main(String[] args) {
		
		Integer[] arr = {1, 2, 3, 4, 5, 1, 6, 7, 2, 8};
	
		List<Integer> arrList = Arrays.asList(arr);
	
		Set<Integer> duplicateElements = arrList.stream().filter(e -> Collections.frequency(arrList, e) > 1).collect(Collectors.toSet());
		
		System.out.println(duplicateElements);
				
		arrList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.forEach(System.out::println);
	}
}

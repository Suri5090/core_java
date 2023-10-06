package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitSkip {

	public static void main(String[] args) {
		
		List<Integer> arrList = Arrays.asList(4,2,5,7,3,7,8,2,1);
		List<Integer> limitArray = arrList.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitArray);
		System.out.println();
		List<Integer> skipArray = arrList.stream().skip(4).collect(Collectors.toList());
		System.out.println(skipArray);
	}
}

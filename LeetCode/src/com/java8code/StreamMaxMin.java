package com.java8code;

import java.util.Arrays;
import java.util.List;

public class StreamMaxMin {

	public static void main(String[] args) {
		
		List<Integer> arrList = Arrays.asList(4,2,5,7,3,7,8,2,1);
		int maxElement = arrList.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println("Max Element: "+maxElement);
		int minElement = arrList.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println("Min Element: "+minElement);
	}
}

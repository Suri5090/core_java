package com.java8code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapString {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "pqr", "adb", "mln", "apk");
		
		
		System.out.println("******************* Process 1 ************************");
		
		List<String> newList = strList.stream().map(str -> {
			if(str.contains("a")) str = str.substring(1);
			return str;
		}).collect(Collectors.toList());
		
		System.out.println(newList);
		
		System.out.println();
		
		System.out.println("******************* Process 2 ************************");
		
		List<String> myList = new ArrayList<>();
				
		strList.stream().forEach(str -> {
			if(str.contains("a")) {
				str = str.substring(1);
			}
			myList.add(str);
		});
		System.out.println(myList);
	}
}

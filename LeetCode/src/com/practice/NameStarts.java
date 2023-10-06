package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStarts {

	public static void main(String[] args) {
		
		String[] strArr = {"Raja", "Rani", "Anirudh", "Balaji"};
		
		List<String> strList = Arrays.asList(strArr);
				
		strList.stream().collect(Collectors.groupingBy(str -> str.charAt(0), Collectors.toList()))
				.entrySet()
				.stream()
				.forEach(e -> System.out.println("Name Starts with "+e.getKey() + " -> "+e.getValue()));
	}
}

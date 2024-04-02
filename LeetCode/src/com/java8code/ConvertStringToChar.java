package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToChar {

	public static void main(String[] args) {
		
		String[] strArray = {"3", "2", "1", "X", "Y", "Z"};

		List<Character> charList = Arrays.stream(strArray).map(str -> str.charAt(0)).collect(Collectors.toList());
		
		System.out.println(charList);
	}
}

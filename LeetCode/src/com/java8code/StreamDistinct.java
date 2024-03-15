package com.java8code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

	public static void main(String[] args) {
		
		String str = "vikatakavisurektv";		
		
		char[] ch = str.toCharArray();
		
		List<Character> list = new ArrayList<>();
		
		for(char c: ch) {
			list.add(c);
		}
		
		List<Character> uniqueList = list.stream().distinct().collect(Collectors.toList());
		uniqueList.forEach(System.out::print);
	}
}

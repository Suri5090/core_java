package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplStringStreamDemo {

	public static void main(String[] args) {
		
		String str = "suresh is good boy and suresh tallent boy suresh tallent and good boy";
		
		String str1 = "vikataikvtkavi";
		
		List<String> slist = Arrays.asList(str.split(" "));
		
		List<Character> clist = str1.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		
		Map<String, Long> counter = slist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(counter);
		
		Map<Character, Long> counter1 = clist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(counter1);
	}
}

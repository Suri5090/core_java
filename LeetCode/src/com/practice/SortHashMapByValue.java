package com.practice;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("suresh", 6);
		map.put("venkat", 5);
		map.put("reddy", 7);
		map.put("hello", 5);

//		map.entrySet().stream().sorted(Entry.<String, Integer> comparingByValue().thenComparing(Entry.comparingByKey()))
//				.forEach(e -> System.out.println(e.getKey()+ " "+e.getValue()));

		map.entrySet().stream().sorted(Comparator.comparing(Entry<String, Integer>::getValue).thenComparing(Entry::getKey))
				.forEach(e -> System.out.println(e.getKey()+ " "+e.getValue()));
	}
}

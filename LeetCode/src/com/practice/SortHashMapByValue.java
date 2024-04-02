package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("suresh", 6);
		map.put("reddy", 5);
		map.put("Venkata", 7);
		map.put("hello", 5);
		

		Set<Entry<String, Integer>> entry = map.entrySet();

		entry.stream().sorted((e1, e2) -> {
			if(e1.getValue().equals(e2.getValue())){
				return e1.getKey().compareTo(e2.getKey());
			}
			return e1.getValue().compareTo(e2.getValue());
		}).forEach(System.out::println);
	}
}

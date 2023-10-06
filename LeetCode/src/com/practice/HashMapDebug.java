package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {

	public static void main(String[] args) {
		
		Dept d1 = new Dept(1);
		Dept d2 = new Dept(1);
		
		Map<Dept, Integer> map = new HashMap<Dept, Integer>();
		
		map.put(d1, 10);
		map.put(d2, 20);
		System.out.println(map.size());
		System.out.println(map);
	}
}

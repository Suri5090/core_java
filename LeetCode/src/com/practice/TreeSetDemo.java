package com.practice;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		System.out.println("-------------Natural Soring Order-------------------");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(9);
		ts.add(15);
		ts.add(23);
		ts.add(16);
		ts.add(5);
		ts.add(2);
		ts.add(14);
		System.out.println(ts);
	}
}

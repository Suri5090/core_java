package com.java8code;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		List<Employee> strList = new ArrayList<Employee>();
		strList.add(new Employee(6, "Suresh"));
		strList.add(new Employee(4, "Ramesh"));
		strList.add(new Employee(9, "Somesh"));
		strList.add(new Employee(7, "Naresh"));
		
		System.out.println(strList);
		
		strList.stream().filter(emp -> emp.id < 5).forEach(str -> System.out.println(str));
	}
}

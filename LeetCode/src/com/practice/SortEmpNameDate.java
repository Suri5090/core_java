package com.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpNameDate{

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Suresh", LocalDate.parse("1999-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(102, "Naresh", LocalDate.parse("1994-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(103, "Somesh", LocalDate.parse("1993-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(104, "Mahesh", LocalDate.parse("1999-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(105, "Rajesh", LocalDate.parse("1994-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		
		
		List<Employee> sortedList = empList.stream().sorted((e1, e2) -> {
			if(!e1.getEdob().equals(e2.getEdob())) {
				return e1.getEdob().compareTo(e2.getEdob());
			}
			return e1.getEname().compareTo(e2.getEname());
		}).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(!e1.getEdob().equals(e2.getEdob())) {
					return e1.getEdob().compareTo(e2.getEdob());
				}
				return e1.getEname().compareTo(e2.getEname());
			}
			
		});
		
		System.out.println(empList);
	}
}

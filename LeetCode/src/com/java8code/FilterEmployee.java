package com.java8code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Suresh", 1000.0, "Sr Dev", "Female"));
		empList.add(new Employee(102, "Naresh", 4000.0, "Dev", "Male"));
		empList.add(new Employee(103, "Somesh", 2000.0, "Dev", "Female"));
		empList.add(new Employee(105, "Ramesh", 1600.0, "CEO", "Male"));
		empList.add(new Employee(101, "Sukesh", 1100.0, "CEO", "Female"));
		empList.add(new Employee(106, "Mahesh", 1900.0, "Sr Dev", "Male"));
		empList.add(new Employee(106, "Mukesh", 1300.0, "Sr Dev", "Male"));
		empList.add(new Employee(108, "Paresh", 1200.0, "Dev", "Female"));
		empList.add(new Employee(109, "Motesh", 1600.0, "Dev", "Male"));
		
		List<Employee> filterEmp = empList.stream().sorted(Comparator.comparing((Employee e) -> e.id).thenComparing((Employee e) -> e.name)).collect(Collectors.toList());
				//empList.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName)).collect(Collectors.toList());
	
		System.out.println(filterEmp);
	}
}

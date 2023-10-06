package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumSalGroupByDep {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(101, "Suresh", 1000, 10));
		empList.add(new Employee(102, "Mukesh", 2000, 20));
		empList.add(new Employee(103, "Ramesh", 3000, 30));
		empList.add(new Employee(104, "Naresh", 4000, 40));
		empList.add(new Employee(105, "Rajesh", 1400, 10));
		empList.add(new Employee(106, "Somesh", 2200, 20));
		empList.add(new Employee(107, "Mahesh", 2600, 20));
		empList.add(new Employee(108, "Rakesh", 3100, 30));
		empList.add(new Employee(109, "Lokesh", 1600, 40));
		empList.add(new Employee(110, "Kamesh", 1300, 10));
		
		Map<Integer, Double> sumSalGroupByDept = empList.stream().collect(Collectors.groupingBy(Employee::getEdept, Collectors.summingDouble(Employee::getEsal)));
		
		System.out.println(sumSalGroupByDept);
	}
}

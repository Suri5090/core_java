package com.java8code;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeAverageSalary {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Suresh", 1000.0, "Sr Dev", "Female"));
		empList.add(new Employee(102, "Naresh", 4000.0, "Dev", "Male"));
		empList.add(new Employee(103, "Somesh", 2000.0, "Dev", "Female"));
		empList.add(new Employee(105, "Ramesh", 1600.0, "CEO", "Male"));
		empList.add(new Employee(104, "Sukesh", 1100.0, "CEO", "Female"));
		empList.add(new Employee(106, "Mahesh", 1900.0, "Sr Dev", "Male"));
		empList.add(new Employee(107, "Mukesh", 1300.0, "Sr Dev", "Male"));
		empList.add(new Employee(108, "Paresh", 1200.0, "Dev", "Female"));
		empList.add(new Employee(109, "Motesh", 1600.0, "Dev", "Male"));
		
		//select gender, avg(sal) from employee group by gender;
		Map<String, Double> avgSalary = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		
		avgSalary.forEach((k,v) -> System.out.println(k +" -> "+ v));
		System.out.println();

		// select Designation, max(salary) from employee group by designation;
		Map<String, Double> maxSalary = empList.stream().collect(Collectors.groupingBy(Employee::getDesignation,
												Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
															emp -> emp.orElse(null).getSalary())));

		maxSalary.forEach((k,v) -> System.out.println(k +" -> "+ v));

		//select Designation, gender, avg(salary) from employee group by designation, gender;
		Map<String, Map<String, Double>> avgSalaryByDesGender = empList.stream().collect(Collectors.groupingBy(Employee::getDesignation, 
				Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
		
		avgSalaryByDesGender.forEach((designation, values) -> 
			{
				System.out.println("Designation: "+designation);
				values.forEach((gender, salary) -> 
				{
					System.out.println("Gender: "+ gender+" Salary: "+ salary);
				});
			}
		);
	}
}
package com.java8code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAverageSalary {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Suresh", 1000, "Sr Dev", "Female"));
		empList.add(new Employee(102, "Naresh", 4000, "Dev", "Male"));
		empList.add(new Employee(103, "Somesh", 2000, "Dev", "Female"));
		empList.add(new Employee(105, "Ramesh", 1600, "CEO", "Male"));
		empList.add(new Employee(104, "Sukesh", 1100, "CEO", "Female"));
		empList.add(new Employee(106, "Mahesh", 1900, "Sr Dev", "Male"));
		empList.add(new Employee(107, "Mukesh", 1300, "Sr Dev", "Male"));
		empList.add(new Employee(108, "Paresh", 1200, "Dev", "Female"));
		empList.add(new Employee(109, "Motesh", 1600, "Dev", "Male"));
		
		//select gender, avg(sal) from employee group by gender;
		Map<String, Double> avgSalary = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		
		avgSalary.forEach((k,v) -> System.out.println(k +" -> "+ v));
		System.out.println();
		
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
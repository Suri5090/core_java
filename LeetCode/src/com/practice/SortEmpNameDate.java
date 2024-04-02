package com.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmpNameDate{

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Suresh", LocalDate.parse("1999-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(102, "Naresh", LocalDate.parse("1994-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(103, "Kalesh", LocalDate.parse("1993-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(104, "Mahesh", LocalDate.parse("1999-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));
		empList.add(new Employee(105, "Rajesh", LocalDate.parse("1994-11-19", DateTimeFormatter.ISO_LOCAL_DATE)));

		empList.sort(Comparator.comparing(Employee::getEdob).thenComparing(Employee::getEname));
		System.out.println(empList);
	}
}

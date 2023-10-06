package com.practice;

import java.util.*;
//import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(10, "Suresh"));
		al.add(new Employee(8, "Naresh"));
		al.add(new Employee(5, "Ramesh"));
		al.add(new Employee(6, "Somesh"));
		al.add(new Employee(1, "Rakesh"));
		System.out.println(al);
		
		//al.stream().filter(emp -> emp.getEid() > 5).collect(Collectors.toList()).forEach(al::remove);
		//System.out.println(al);
		
		
		 Iterator<Employee> itr = al.iterator(); 
		 while(itr.hasNext()) { 
			 Employee e1 = itr.next(); 
			 if(e1.getEid()>5) { 
				 itr.remove(); 
			 } 
		 }
		 
		 System.out.println(al);
	}
}

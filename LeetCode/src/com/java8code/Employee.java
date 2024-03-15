package com.java8code;

public class Employee {

	Integer id;
	String name;
	Double salary;
	String designation;
	String gender;
	
	public Employee(Integer id, String name, Double salary, String designation, String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.gender = gender;
	}
	
	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", gender=" + gender + "]";
	}
}

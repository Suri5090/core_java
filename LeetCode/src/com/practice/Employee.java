package com.practice;

import java.time.LocalDate;

public class Employee{

	private int eid;
	private String ename;
	private double esal;
	private int edept;
	private LocalDate edob;
	
	public Employee() {
	}
	
	public Employee(int id, String name, LocalDate dob) {
		this.eid = id;
		this.ename = name;
		this.edob = dob;
	}

	public Employee(int id, String name) {
		this.eid = id;
		this.ename = name;
	}

	public Employee(int id, String name, double sal, int dept) {
		this.eid = id;
		this.ename = name;
		this.esal = sal;
		this.edept = dept;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public LocalDate getEdob() {
		return edob;
	}

	public void setEdob(LocalDate edob) {
		this.edob = edob;
	}
	
	public void setEdept(int edept) {
		this.edept = edept;
	}
	
	public int getEdept() {
		return edept;
	}
	
	public void setEsal(double esal) {
		this.esal = esal;
	}
	
	public double getEsal() {
		return esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edept=" + edept + ", edob=" + edob
				+ "]";
	}	
}

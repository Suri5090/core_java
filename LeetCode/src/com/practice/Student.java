package com.practice;

import java.io.Serializable;

public class Student implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int id;

	Student(){
		System.out.println("Student Constructor call");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

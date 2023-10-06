package com.practice;

public class PassingNullPara {

	public static void main(String[] args){
		  callInternalMethod(null);
	}
	public static void callInternalMethod(String A){
	    System.out.println("Inside String");
	}

	public static void callInternalMethod(Object A){
	    System.out.println("Inside Object");
	}	
}

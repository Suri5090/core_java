package com.java8code;

//Lambda Function is the implementation of functional interface. 
//It is an anonymous function and it doesn't have any method name, return type and modifier.
//It is denoted with -> symbol.
//It is used to reduce the code.
public class LambdaFunction1{

	public static void main(String[] args) {
		
		Interf sq = (n) -> n*n;
		System.out.println(sq.square(5));
	}
}

@FunctionalInterface
interface Interf{
	public int square(int n);
}

//FunctionalInterface is an interface having only one abstract method and any number of static and default methods.
//@FunctionalInterface annotation is used to declare an interface as FunctionalInterface.
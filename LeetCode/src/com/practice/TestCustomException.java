package com.practice;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String str) {
		super(str);
	}
}

public class TestCustomException {

	public static void validate(int age) {
		if(age<18) {
			throw new InvalidAgeException("You are not eligible for vote");
		}
		else {
			System.out.println("You are eligible");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter Age: ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
				
		validate(age);
		sc.close();
	}
}

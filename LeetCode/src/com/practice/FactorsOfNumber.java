//Input: 20 
//Output: 1, 2, 4, 5, 10, 20

package com.practice;

public class FactorsOfNumber {

	public static void main(String[] args) {
		
		int number = 20;
		printAllFactors(number);
	}

	private static void printAllFactors(int number) {
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i+ " ");
			}
		}
	}
}

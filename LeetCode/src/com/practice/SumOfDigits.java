package com.practice;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int n = 456;
		
		int res = sumOfDigits(n);
		System.out.println(res);
	}

	private static int sumOfDigits(int n) {
		
		int sum = 0;
		int rem;
		while(n>0) {
			rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		if(sum>9) {
			return sumOfDigits(sum);
		}
		return sum;
	}
}

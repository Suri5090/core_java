package com.practice;

public class ReverseDigit {
	public int reverse(int integer) {
		boolean negflag=false;
		if(integer<0){
			negflag=true;
			integer=integer*-1;
		}
		int rev=0;
		int rem=0;
		while(integer!=0){
			rem=integer%10;
			int newrev= rev*10+rem;
			if((newrev-rem)/10!=rev){
				return 0;
			}
			else{
				rev=newrev;
			}
			integer=integer/10;
		}
		return  rev = negflag?rev*-1:rev;
	}

	public static void main(String[] args) {
		ReverseDigit rd = new ReverseDigit();
		System.out.println(rd.reverse(2147483642));
	}
}

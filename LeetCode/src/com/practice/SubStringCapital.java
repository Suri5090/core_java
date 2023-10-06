package com.practice;

public class SubStringCapital {

	public static void main(String[] args) {
		
		String str = "it is the best website to learn technology";
		String[] strArr = str.split(" ");
		for(String word : strArr) {
			word = word.substring(0,1).toUpperCase()+word.substring(1); 
			System.out.print(word+" ");
		}
	}
}

package com.practice;

public class PatternTriangle {

	public static void main(String[] args) {
		
		int height = 5;
		int width = 5;
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=width; i++) {
			for(int j=0; j<width; j++) {
				if(j>=width-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

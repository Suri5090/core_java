package com.practice;

import java.util.Scanner;

public class InputFromCmd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte b = sc.nextByte();
		short s = sc.nextShort();
		int i = sc.nextInt();
		long l = sc.nextLong();
		char ch = sc.next().charAt(0);
		String str = sc.next();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		
		System.out.println(b+", "+s+", "+i+", "+l+", "+f+", "+d+", "+ch+", "+str);
		
		sc.close();
	}
}

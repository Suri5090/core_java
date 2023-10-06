package com.practice;

public class StringDemo {

	public static void main(String[] args) {
		
		char[] ch = {'s', 'U', 'r', 'E', 's', 'H'};
		
		String str = String.copyValueOf(ch);
		
		System.out.println("Convert from char[] to string: "+ str);
		System.out.println("Length of String: "+ str.length());
		System.out.println("Concat of String: "+ str.concat(" from AP"));
		System.out.println("String comparision: " + str.equals("suresh"));
		System.out.println("String Index of: "+ str.indexOf('r'));
		System.out.println("String Last Index of: "+ str.lastIndexOf('s'));
		System.out.println("String Starts with: "+str.startsWith("su"));
		System.out.println("String ends with: "+str.endsWith("su"));
		System.out.println("String in Uppercase: "+ str.toUpperCase());
		System.out.println("String in Lowercase: "+ str.toLowerCase());
		String[] str1 = ("venkata suresh reddy").split(" ");
		for(String str2: str1)
			System.out.println("String Split with: "+ str2);
		String str3 = "  Junk   ";
		System.out.println("String trim spaces: "+ str3.trim());
		
		String str4 = "10";
		System.out.println("Convert from String to Int: "+ Integer.parseInt(str4));
	}
}

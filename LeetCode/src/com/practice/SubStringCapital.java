package com.practice;

import com.sun.xml.internal.ws.util.StringUtils;

public class SubStringCapital {

	public static void main(String[] args) {
		
		String str = "it is the best website to learn technology";

		String result = subStrCapital(str);
		System.out.println(result);
	}

	private static String subStrCapital(String str) {

		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();

		for(String word : strArr) {
			word = StringUtils.capitalize(word);
			sb.append(word).append(" ");
		}

		return sb.toString();
	}
}

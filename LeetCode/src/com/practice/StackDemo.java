package com.practice;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(5);
		stk.push(9);
		stk.push(1);
		stk.push(3);
		stk.push(9);
		stk.push(6);
		System.out.println(stk.indexOf(9));
		System.out.println(stk.indexOf(7));
		System.out.println(stk.indexOf(9, stk.indexOf(1)));// stk.indexOf(9, 3);
		
		//Stack<Character> stk1 = new Stack<>();
		String str = "abaade";
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			//stk1.push(c);
			if(ch[i]=='a') {
				System.out.println(ch[i]+" is occured at : "+i+" index");
				break;
			}
		}
		System.out.println(str.indexOf('a'));
		//System.out.println(stk1);
		//System.out.println(stk1.indexOf('a'));
	}
}

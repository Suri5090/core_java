package com.practice;

import java.util.Stack;

public class ValidString   
{
	public static boolean checkValidString(String str)   
	{
		Stack<Character> stk = new Stack<Character>();
		
        char ch[] = str.toCharArray();
        for(char c : ch){
            if(c == '(')
                stk.push(')');
            else if(c == '{')
                stk.push('}');
            else if(c == '[')
                stk.push(']');
            else if(stk.isEmpty() || stk.pop()!= c)
                return false;
        }
        return stk.isEmpty();
	}
	
	public static void main(String[] args) {
		String str = "(())";
		boolean isValid = checkValidString(str);
		if(isValid) {
			System.out.println("String is valid");
		}
		else {
			System.out.println("String is not valid");
		}
	}
}
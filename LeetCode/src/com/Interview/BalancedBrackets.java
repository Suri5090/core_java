package com.Interview;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "[(])";
        boolean check = balancedBrackets(str);
        if(check)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }

    private static boolean balancedBrackets(String str) {

        Stack<Character> stack = new Stack<>();

        if(str.length() % 2 != 0) return false;
        int count=0;
        for(char ch : str.toCharArray()){
            if(ch == '{' || ch=='(' || ch=='['){
                stack.push(ch);
                count++;
            }else{
                if((ch == '}' && stack.get(--count) == '{') || (ch == ']' && stack.get(--count) == '[') || (ch == ')' && stack.get(--count) == '(')){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
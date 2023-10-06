package com.practice;

public class StrRevDemo {

	public static void main (String[] args) {
        
        String str= "suresh", nstr="";
                
        for (int i=str.length()-1; i>=0; i--)
        {
        	nstr= nstr + str.charAt(i);
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

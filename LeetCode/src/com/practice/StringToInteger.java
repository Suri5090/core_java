package com.practice;

public class StringToInteger {

	public static void main(String[] args) {
		
		String str = "     -24   sdflkksjf";
		System.out.println(myAtoI(str));
	}

	private static int myAtoI(String str) {
		
		if(str==null || str.length()<1) {
			return 0;
		}
		
        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;
        
        //str = str.replaceAll("^\\s+", "");
        
        str = str.trim();
        
        System.out.println(str);
        
        int i = 0;
        
        boolean isPositive = str.startsWith("+");
        
        boolean isNegative = str.startsWith("-");
        
        if(isPositive) {
        	i++;
        }
        else if(isNegative) {
        	i++;
        }
        
        double number = 0;
        
        while(i<str.length() && str.charAt(i)>'0' && str.charAt(i)<='9') {
        	number = number*10 + (str.charAt(i)-'0');
        	i++;
        }
        
        number = isNegative?-number:number;
        
        if (number < INT_MIN) {
            return INT_MIN;
        }
        if (number > INT_MAX) {
            return INT_MAX;
        }
        
		return (int)number;
	}
}

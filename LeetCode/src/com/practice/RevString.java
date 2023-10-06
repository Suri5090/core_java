package com.practice;

public class RevString {

	public static void main(String[] args) {
        String str = "United States of America";
        String res = new String("");
        String[] str1 = str.split(" ");
        for(int i=0; i<str1.length; i++){
            for(int j=str1[i].length()-1; j>=0; j--){
                res = res + str1[i].charAt(j);
            }
            res = res + " ";
        }
        System.out.println(res);
    }
}

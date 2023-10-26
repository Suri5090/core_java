package com.practice;

public class CamelToSnake {

    public static void main(String[] args) {
        String str = "whatIsYourName";
        System.out.print(camelToSnake(str));
    }

    public static String camelToSnake(String str) {
        StringBuilder sb = new StringBuilder();
        //TODO Write code here
        char[] ch = str.toCharArray();
        for(char c: ch){
            if(Character.isUpperCase(c)){
                sb=sb.append("_").append(c);
            }
            else{
                sb=sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}

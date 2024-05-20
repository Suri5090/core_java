package com.Interview;

public class Test {

    public static void main(String[] args) {
        String str = "hello suresh";
        Character ch = str.chars().mapToObj(c -> (char)c).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
        System.out.println(ch);
    }
}

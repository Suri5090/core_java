package com.practice;

public class MaskString {

    public static void main(String[] args) {

        String name = "venkat suresh";
        String result = name.replaceAll(".(?<=.{2}.\\S(?=.{2}))", "*");
        System.out.println(result);
    }
}

package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("India", "Usa", "Japan", "France", "Germany", "Italy");

        String str = list.stream().map(word -> word.toUpperCase()).collect(Collectors.joining(", "));

        System.out.println(str);
    }
}

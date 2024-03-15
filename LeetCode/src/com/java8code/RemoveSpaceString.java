package com.java8code;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveSpaceString {

    public static void main(String[] args) {

        String name = "venkata suresh reddy";
        String out = Stream.of(name).map(s -> s.replace(" ", "")).findAny().get();
       // String out = name.chars().filter(c -> !Character.isWhitespace(c)).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(out);
    }
}

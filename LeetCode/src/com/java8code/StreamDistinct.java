package com.java8code;

public class StreamDistinct {

	public static void main(String[] args) {
		String str = "vikatakavisurektv";
		str.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::print);
	}
}

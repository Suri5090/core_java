package com.practice;

public class PingPong {

	public static void main(String[] args) {
		
		for(int i = 1; i<=21; i++) {

			if(i%21 == 0) {
				System.out.println("pingpong");
			}
			else if(i%3 == 0) {
				System.out.println("ping");
			}
			else if(i%7 == 0) {
				System.out.println("pong");
			}
			else {
				System.out.println(i);
			}
		}
	}
}

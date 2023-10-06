package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RevRandomElement {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			numList.add(random.nextInt(100));
		}
		System.out.println(numList);
		
		for(int j = numList.size()-1; j>0; j--) {
			System.out.print(numList.get(j)+ " ");
		}
	}
}

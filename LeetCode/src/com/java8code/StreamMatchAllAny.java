package com.java8code;

import java.util.ArrayList;
import java.util.List;

public class StreamMatchAllAny {

	public static void main(String[] args) {
		
		List<Product> prodList = new ArrayList<>();
		
		prodList.add(new Product(1,"Samsung A5",17000f));  
		prodList.add(new Product(3,"Iphone 6S",65000f));  
		prodList.add(new Product(2,"Sony Xperia",25000f));  
		prodList.add(new Product(4,"Nokia Lumia",15000f));  
		prodList.add(new Product(5,"Redmi4 ",26000f));  
		prodList.add(new Product(6,"Lenevo Vibe",19000f));
		
		boolean b= prodList.stream().allMatch(p -> p.name.startsWith("S"));
		//boolean b= prodList.stream().anyMatch(p -> p.name.startsWith("S"));
		if(b==true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
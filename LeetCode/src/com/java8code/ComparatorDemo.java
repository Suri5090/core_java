package com.java8code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Product> prodList = new ArrayList<>();
		
		prodList.add(new Product(1,"Samsung A5",17000f));  
		prodList.add(new Product(3,"Iphone 6S",65000f));  
		prodList.add(new Product(2,"Sony Xperia",25000f));  
		prodList.add(new Product(4,"Nokia Lumia",15000f));  
		prodList.add(new Product(5,"Redmi4 ",26000f));  
		prodList.add(new Product(6,"Lenevo Vibe",19000f));  
		
		//List<Product> sortProduct= prodList.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name)).collect(Collectors.toList());
		//sortProduct.stream().forEach(p -> System.out.println(p.id +" "+ p.name +" "+ p.price));
		
		
		Collections.sort(prodList, (p1, p2) -> 
		{ 
			return p1.name.compareTo(p2.name);
		});
		 
		prodList.stream().forEach(p -> System.out.println(p.id +" "+ p.name +" "+ p.price));
		
		System.out.println();
		System.out.println("Products having less than 20000 price");
		System.out.println("------------------------------------------");
		
		prodList.stream().filter(p -> p.price < 20000).forEach(p -> System.out.println(p.id +" "+ p.name +" "+ p.price));
	}
}

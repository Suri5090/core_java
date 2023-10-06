package com.practice;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsArray {

	public static void main(String[] args) {
		
		int arr1[] = {1, 3, 5, 7, 2, 6};
		int arr2[] = {4, 6, 7, 1, 8, 3};
		int arr3[] = {9, 6, 1, 5, 3, 4};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					for(int k=0; k<arr3.length; k++) {
						if(arr1[i]==arr3[k]) {
							list.add(arr1[i]);
							break;
						}
					}
					break;
				}
			}
		}
		list.forEach(i -> System.out.print(i+" "));
	}
}

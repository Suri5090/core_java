package com.practice;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		
		int[][] arr = {  {12, 1, 14, 3, 16},
						 {14, 2, 1, 3, 35},
						 {14, 1, 14, 3, 11},
						 {14, 25, 3, 2, 1},
						 {1, 18, 3, 21, 14}  
					  };
		
		findCommonValues(arr);
	}

	private static void findCommonValues(int[][] arr) {
		
		int min_row=0;
		int i, j, row_cnt;
		
		List<Integer> list = new ArrayList<Integer>();

		for(i=0; i<arr.length; i++)
		{
			row_cnt = 1;   // count the no.of rows matching;
			for(j=0; j<arr.length; j++)
			{
				if(arr[min_row][i]==arr[row_cnt][j])
				{
					row_cnt++;
					j=-1;
				}
				if(row_cnt==arr.length)
				{
					list.add(arr[min_row][i]);
					break;
				}
			}
		}
		System.out.println("Common elements are: " + list);
		//list.stream().forEach(System.out::println);
	}
}

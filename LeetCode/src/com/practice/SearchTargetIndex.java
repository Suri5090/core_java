package com.practice;

public class SearchTargetIndex {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6};
		int target = 3;
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == target)
			{
				System.out.println(i);
				return;
			}
			else if(arr[i] > target) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}

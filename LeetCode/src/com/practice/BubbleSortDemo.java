package com.practice;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
        int arr[]={2,0,1,1,2,0}, temp;
        int n = arr.length;
        int i, j;
        for (i = 0; i < n - 1; i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int k:arr) {
        	System.out.print(k + " ");
        }
        
        System.out.println();
        
        int[] arr1 = { 5, -2, 23, 7, 87, -42, 509 };
        
        Arrays.sort(arr1);
        
        for(int k:arr1) {
        	System.out.print(k + " ");
        }
    }
}

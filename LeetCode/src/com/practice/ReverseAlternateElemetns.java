package com.practice;

import java.util.Arrays;

public class ReverseAlternateElemetns {

	public static void main(String[] args) {
        int arr[] = {3,1,5,2,7,9};
        int len = arr.length;      
        int temp;
        if(len%2 == 1) {
        	int last = len-1;
        	for(int first = 0; first < last; first+=2) {
        		temp = arr[first];
        		arr[first] = arr[last];
        		arr[last] = temp;
            	last-=2;        		
        	}
        }else {
        	int last = len-2;
        	for(int first = 0; first < last; first+=2) {
        		temp = arr[first];
        		arr[first] = arr[last];
        		arr[last] = temp;
            	last-=2;
        	}
        }
        System.out.println(Arrays.toString(arr));
    }
}

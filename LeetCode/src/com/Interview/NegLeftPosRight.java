package com.Interview;

//input: 17, -12, 11, -13, -5, 6, -7, 5, -3, -6
//output: -12, -13, -5, -7, -3, -6, 17, 11, 6, 5

import java.util.Arrays;

public class NegLeftPosRight {

    public static void main(String[] args) {

        int[] arr = {17, -12, 11, -13, -5, 6, -7, 5, -3, -6};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j < arr.length-1; j++){
                if(arr[j] > 0 && arr[j+1] < 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package com.Interview;

//input: 17, -12, 11, -13, -5, 6, -7, 5, -3, -6
//output: -12, -13, -5, -7, -3, -6, 17, 11, 6, 5

import java.util.Arrays;

public class NegLeftPosRight {

    public static void main(String[] args) {

        int[] arr = {17, -12, 11, -13, -5, 6, -7, 5, -3, -6};
        int temp;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>0 && arr[i+1]<0){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

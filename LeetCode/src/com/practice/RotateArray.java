package com.practice;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] res = rotateArray(arr, 2);

        System.out.println(Arrays.toString(res));
    }

    private static int[] rotateArray(int[] arr, int r) {
        int row;
        int newArray[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            row = (r + i) % arr.length;
            newArray[row] = arr[i];
        }
        return newArray;
    }
}

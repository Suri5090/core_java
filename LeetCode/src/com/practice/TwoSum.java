package com.practice;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 7;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; ; i++){
            int x = nums[i];
            int y = target-x;
            if(map.containsKey(y)){
                return new int[]{map.get(y), i};
            }
            map.put(x, i);
        }
    }
}

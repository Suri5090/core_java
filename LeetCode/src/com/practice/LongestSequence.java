package com.practice;

import java.util.Arrays;

public class LongestSequence {

    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6, 12, 16};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    private static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n < 2)
            return n;

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        int count = 1, t = 1;

        for(int i=1; i<nums.length; i++){
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                count = Math.max(count, ++t);
            }else{
                t=1;
            }
        }
        return count;
    }
}

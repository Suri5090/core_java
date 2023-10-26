package com.practice;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, left = 1; i < n; ++i) {
            ans[i] = left;
            left *= nums[i];
        }

        for(int i=nums.length-1, right=1; i>=0; i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}

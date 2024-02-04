package org.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class MaxProdSubArray {
    public int maxProduct(int[] nums) {
        int curMax = 1;
        int curMin = 1;
        int res = nums[0];
        int max =0;

        for (int j=0;j<nums.length;j++){
            if(max<nums[j]){
                res = nums[j];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                curMax = 1;
                curMin = 1;
            }
            int tmp = curMax*nums[i];
            curMax = Collections.max(Arrays.asList(nums[i]*curMax,nums[i]*curMin,nums[i]));
            curMin = Collections.max(Arrays.asList(tmp, nums[i]*curMin,nums[i]));
            res = Math.max(res, curMax);
        }
        return res;
    }
}

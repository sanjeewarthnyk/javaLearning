package org.leetcode;

import java.util.HashMap;

public class SolFour {
        public int[] twoSum(int[] nums, int target) {
            HashMap map = new HashMap<Integer, Integer>();
            int[] val = new int[2];
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])){
                    val[0] = (Integer) map.get(target-nums[i]);
                    val[1]= i;
                    break;
                }else{
                    map.put(nums[i],i);
                }
            }
            return val;
        }
}

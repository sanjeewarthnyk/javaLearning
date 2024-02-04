package org.leetcode;

import java.util.HashSet;

public class CheckDuplicateValue {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();
        boolean flag = false;
        for(int i: nums){
           if(!hset.add(i)) {
               flag = true;
               break;
           };
        }
        return flag;
    }
}

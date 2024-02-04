package org.leetcode;

import log.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner {
    public static void main(String[] args){
        SolFour sf = new SolFour();
        BuyStocks bs = new BuyStocks();
        CheckDuplicateValue cdv = new CheckDuplicateValue();
       int target = 9;
       int[] nums =  {7,1,5,3,6,4};
       int[] duplicate =  new int[] {1,2,3,4};
       //System.out.println(Arrays.toString(sf.twoSum(nums, target)));
       //System.out.println(bs.maxProfit(nums));
       //System.out.println(cdv.containsDuplicate(duplicate));
        //ProductOfArrayOfSelf pas = new ProductOfArrayOfSelf()
       // MaxSumSubArray mss = new MaxSumSubArray();
      // System.out.println(mss.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        MaxProdSubArray mps = new MaxProdSubArray();
      System.out.println(mps.maxProduct(new int[]{2,-5,-2,-4,3}));

        ArrayList al = new ArrayList();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        Collections.shuffle(al);

    }

}

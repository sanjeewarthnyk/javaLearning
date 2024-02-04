package org.leetcode;

public class ProductOfArrayOfSelf {
    public int[] productExceptSelf1(int[] nums) {
        int pre[] = new int[nums.length];
        int post[] = new int[nums.length];

        int preN = 1;
        int postN=1;

        for(int i=0;i<nums.length;i++){
            pre[i]=preN * nums[i];
            preN = pre[i];
        }
        for(int j= nums.length -1;j>=0;j--){
            post[j]=postN*nums[j];
            postN = post[j];
        }

        for(int k =0; k<nums.length; k++){
            if(k==0) {
                nums[k]=1*post[k+1];
            } if(k==nums.length-1){
                nums[k]=pre[k-1]*1;
            }if(k!=0 && k!=nums.length-1){
                nums[k]=pre[k-1]*post[k+1];
            }
        }
        return nums;
    }

    public int[] productExceptSelf2(int[] nums) {
        int pre=1;
        int post=1;
        int[] res = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            res[i]=pre;
            pre *=nums[i];
        }

        for(int j=nums.length-1;j>=0;j--){
            res[j]*=post;
            post *=nums[j];
        }

        return res;

    }

}

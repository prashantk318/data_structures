package com.Array.problems;

public class MinSubArrayLens {
	 public int minSubArrayLen(int target, int[] nums) {
		 if(nums == null || nums.length == 0)
	            return 0;
	        int start =0;
	        int end =0;
	        int sum =0;
	        
	       int min = Integer.MAX_VALUE;
	        while(end<nums.length){
	            sum += nums[end++];
	            while(sum>=target){
	                min = Math.min(min,end-start);
	                sum = sum-nums[start++];
	            }
	        }
	        if(min !=Integer.MAX_VALUE){
	            return min;
	        }else{
	            return 0;
	        }
	        
	    }

}

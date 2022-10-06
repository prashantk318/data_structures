package com.Array.problems;

public class MissingPositiveInteger {
	
	public static void main(String[] args) {
		int s = missinginteger(new int[] {1,2,3,4,5});
		System.out.println(s);
		
	}
public static int missinginteger(int[]nums) {
	if(nums.length==0) {
		return 1;
	}
	
	for(int i=0;i<nums.length;) {
		if(nums[i]>nums.length || nums[i]<=0) {
			i++;
		}else if(nums[nums[i]-1]==nums[i]) {
			i++;
		}else {
			int temp = nums[nums[i]-1];
			nums[nums[i]-1] = nums[i];
			nums[i]=temp;
		}
	}
	
	 int i=0;
     for(i=0;i<nums.length;i++){
         if(nums[i]!=i+1)
        	 return i+1;
     }
     
     return nums[nums.length-1]+1;
}
}

package com.Array.problems;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		RotateArray a = new RotateArray();
		int[]arr = {1,2,3,4,5,6,7};
		a.rotate(arr, 3);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void rotate(int[]nums,int k) {
		k = k%nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		
	}

	private void reverse(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end) {
			int temp = nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}

}

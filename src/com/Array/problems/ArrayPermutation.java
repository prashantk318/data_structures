package com.Array.problems;

import java.util.Arrays;

public class ArrayPermutation {
	public static void main(String[] args) {
		ArrayPermutation pum = new ArrayPermutation();
		int[] nums = new int[] {1,2,3};
		pum.permutation(nums, 0);
	}
	
	public void permutation(int[]nums, int pos) {
		if(nums.length==pos) {
			System.out.println(Arrays.toString(nums));
		}
		
		for(int i=pos;i<nums.length;i++) {
			swap(nums, i, pos);
			permutation(nums, pos+1);
			swap(nums, i, pos);
		}
	}

	private void swap(int[] nums, int i, int pos) {
		// TODO Auto-generated method stub
		
		int temp = nums[pos];
		nums[pos] = nums[i];
		nums[i] = temp;
		
	}

}

package com.Array.problems;



public class ArrayInsertOrSearch {
	public static void main(String[] args) {
		int[]arr = {1,2,3};
	int s	= searchInsert(arr, 4);
	System.out.println(s);
	}
public static int searchInsert(int[] nums, int target) {
	 int pivot, left = 0, right = nums.length - 1;
	    while (left <= right) {
	      pivot = left + (right - left) / 2;
	      if (nums[pivot] == target) return pivot;
	      if (target < nums[pivot]) right = pivot - 1;
	      else left = pivot + 1;
	    }
	    return left;
	  }
        
    }



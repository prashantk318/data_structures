package com.Array.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,4,5,7,6};
		int missingNumber = getMissingNumber(arr);
		System.out.println(missingNumber+" "+Arrays.toString(arr));
	}
	
	private static int getMissingNumber(int[] nums) { 
		 Set<Integer> numSet = new HashSet<Integer>();
	        for (int num : nums) numSet.add(num);

	        int expectedNumCount = nums.length + 1;
	        for (int number = 0; number < expectedNumCount; number++) {
	            if (!numSet.contains(number)) {
	                return number;
	            }
	        }
	        return -1;
	    }
	}




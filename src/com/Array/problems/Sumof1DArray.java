package com.Array.problems;

public class Sumof1DArray {
	public static void main(String[] args) {
		int [] arr = sumArray(new int[] {1,2,3});
		for(Integer r:arr) {
			System.out.println(r);
		}
	}
	
	public  static int[] sumArray(int[]nums) {
		int length = nums.length;
		
		int[] arr = new int[length];
		
		int sum =0;
		for(int i=0;i<length;i++) {
			int j = i;
			sum = sum+nums[i];
			arr[j] = sum;
		}
		return arr;
	}

}

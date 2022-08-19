package com.Array.problems;

import java.util.Arrays;

public class FindOddEvenNumber {
	public static void main(String[] args) {
		int [] arr2 = {1,4,8,15,44,18,17};
		FindOddEvenNumber g = new FindOddEvenNumber();
arr2= evenOddNumber(arr2);
	for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);
		
	}
	System.out.println("hii");
	}
	
	
	public static int[] evenOddNumber(int[]arr) {
		
		int left = 0;
		int right = arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			while(arr[left]%2==0) {
				left++;
			}
			while(arr[right]%2==1) {
				right--;
			}
			
			if(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right]=temp;
			}
		}
		return arr;
	}

}

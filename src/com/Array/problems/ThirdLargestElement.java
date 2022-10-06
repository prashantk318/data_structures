package com.Array.problems;

public class ThirdLargestElement {
	public static void main(String[] args) {
		int[]num = new int[] {1,2,4,5,6,7,8,3,9};
		thirdLargest(num);
	}
	
	public static void thirdLargest(int[]arr) {
		int first = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>first) {
				first = arr[i];
			}
		}
		
		int second = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<first&&arr[i]>second) {
				second = arr[i];
			}
		}
		
		int third = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<first && arr[i]<second) {
				third = arr[i];
			}
		}
		System.out.println("Third Largest Element is"+" "+third);
	}

}

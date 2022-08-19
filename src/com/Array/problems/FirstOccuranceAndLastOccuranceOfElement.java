package com.Array.problems;

public class FirstOccuranceAndLastOccuranceOfElement {
	public static void main(String[] args) {
		 int arr[] = new int[]{2,3,4,5,5,7,7,7,9,11};
		 
		   int target = 7;
		   firstAndLastOccurance(arr, target);   
	}
	
	
	public static void firstAndLastOccurance(int[]arr, int target) {
		int left = -1;
		int right = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				left = i;
				break;
			}
			}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==target) {
				right =i;
				break;
			}
		}
		
		System.out.println(left+" "+right);
	}

}

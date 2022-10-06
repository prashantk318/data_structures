package com.search;

public class BinarySearch {
	public static void main(String[] args) {
		int[]arr = new int[] {1,3,4,5,7,8,9};
		binarySearch(arr, 9);
	}
	
	public static int binarySearch(int[]num, int value) {
		int start =0;
		int end = num.length -1;
		
		int mid = (start+end)/2;
		System.out.println(start+" "+end+ " "+mid);
		if(num[mid] == value) {
			return mid;
		}
		
		while(num[mid]!=value) {
			if(value<num[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			mid = (start+end)/2;
			System.out.println(start+" "+end+ " "+mid);
		}
		
		return mid;
		
	}

}

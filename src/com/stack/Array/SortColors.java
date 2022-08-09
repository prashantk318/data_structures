package com.stack.Array;

import java.util.Arrays;

public class SortColors {
	public static void main(String[] args) {
		int[]num = {0,1,1,0,2,2};
		SortColors s = new SortColors();
		s.sort(num);
		System.out.println(Arrays.toString(num));
		
	}

	public void sort(int[]arr1) {
		int left =0;int mid=0; int right = arr1.length-1;
		while(mid<=right) {
		if(arr1[mid]==0) {
			swap(left,mid,arr1);
			left++;
			mid++;
		}else if(arr1[mid]==1){
			mid++;
		}else {
			swap(right,mid,arr1);
			right--;
		}
		}
		
	}

	private void swap(int i, int j, int[] num) {
		
	int temp  = num[i];
	num[i] =num[j];
	num[j]=temp;
	}
}

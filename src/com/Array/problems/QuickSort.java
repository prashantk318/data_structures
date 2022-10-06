package com.Array.problems;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		
		int []arr = {1,2,3,5,6,1};
		QuickSort q = new QuickSort();
		q.sort(arr);
		System.out.println(Arrays.toString(arr));
				
	}
	int[] input =null;
	private int length =0;
	public void sort(int[] num) {
		if(num.length ==0||num==null)
			return;
		this.input = num;
		length = input.length;
		quicksort(0, length-1);
		
	}
	public void quicksort(int start, int end) {
		
		int i = start;
		int j = end;
		
		
		
		int pivot = input[start+(end-start)/2];
		while(i<=j) {
			if(input[i]<pivot) {
				i++;
			}
			if(input[j]>pivot) {
				j--;
			}
			if(i<=j) {
				swap(i,j);
				i++;
				j--;
			}
			
			if(start<j)
				quicksort(start, j);
			
			if(i<end)
				quicksort(i, end);
			
		}
	}
	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = input[i]; 
		input[i] = input[j];
		input[j] = temp;
		
	}

}

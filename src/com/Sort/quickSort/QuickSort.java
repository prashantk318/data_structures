package com.Sort.quickSort;

public class QuickSort {
	static int partition(int[]arr, int start, int end) {
		int pivot =end;
		int i = start-1;
		for(int j=start;j<=end;j++) {
			if(arr[j]<=arr[pivot] ){
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		return i;
	}
	public static void quickSort(int[]arr, int start, int end) {
		if(start<end) {
			int pivot = partition(arr, start, end);
			quickSort(arr,start,pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}

	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

package com.Sort.mergeSort;

public class MergeSort {
	
	static void merge(int[]arr, int left, int middle, int right) {
		int[]leftTempArray = new int[middle-left+1];
		int[]rightTempArray = new int[right-middle];
		for(int i=0;i<middle-left+1;i++) {
			leftTempArray[i] = arr[left+i];
		}
		for(int i=0;i<right-middle;i++) {
			rightTempArray[i] = arr[middle+1+i];
		}
		
		int i=0, j=0;
		 int k = left;
	        while (i < middle-left+1 && j < right-middle) {
	            if (leftTempArray[i] <= rightTempArray[j]) {
	                arr[k] = leftTempArray[i];
	                i++;
	            }
	            else {
	                arr[k] = rightTempArray[j];
	                j++;
	            }
	            k++;
	        }
	 
	        /* Copy remaining elements of L[] if any */
	        while (i < middle-left+1) {
	            arr[k] = leftTempArray[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < right-middle) {
	            arr[k] = rightTempArray[j];
	            j++;
	            k++;
	        }
	    }
	
	public static void mergeSort(int[]arr, int left, int right) {
		if(right>left) {
			int middle = (left+right)/2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);
			merge(arr, left, middle, right);
		}
		
	}
	
	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

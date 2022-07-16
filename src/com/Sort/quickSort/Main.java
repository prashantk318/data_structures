package com.Sort.quickSort;

public class Main {
	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		int arr[] = {10,3,2,5,4};
		quick.quickSort(arr, 0, arr.length-1);
		quick.printArray(arr);
	}

}

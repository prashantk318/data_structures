package com.Sort.selection;

public class SelectionSort {
	static void selectionSort(int arr[]) {
		for(int j=0;j<arr.length;j++) {
			int minimuIndex = j;
			for(int i=j+1;i<arr.length;i++) {
				if(arr[i]<arr[minimuIndex]) {
					minimuIndex = i;
				}
			}
			if(minimuIndex !=j) {
				int temp = arr[j];
				arr[j] = arr[minimuIndex];
				arr[minimuIndex]=temp;
			}
			
		}
	}
	
	
	
	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

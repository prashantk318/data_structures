package com.Sort.insertion;

public class InsertionSort {
	
	
	public void insertionSort(int str[]) {
		
		for(int i=1;i<str.length;i++) {
			int key = str[i];
			
			int j = i-1;
			while(j>=0 && str[j]>key) {
				str[j+1] = str[j];
				j--;
			}
			
			str[j+1] = key;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {2,1,3,4,8,6,9};
		InsertionSort l = new InsertionSort();
	l.insertionSort(arr);
		for( int i:arr) {
			System.out.println(i);
		}
	}

}

package com.Sort.bubble;

public class Main {
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int arr[] = {1,5,4,8};
		sort.bubbleSort(arr);
		sort.printArray(arr);
	}

}

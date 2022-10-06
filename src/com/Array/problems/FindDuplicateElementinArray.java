package com.Array.problems;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementinArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,3,2,4,5,5};
		List<Integer> list = findDuplicateElement(arr);
		for(Integer l:list) {
			System.out.println(l);
		}
	}
	
	public static  List<Integer>findDuplicateElement(int arr[]){
		List<Integer>lists = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int value = Math.abs(arr[i]);
			if(arr[value-1]<0) {
				lists.add(arr[i]);
			}else {
				arr[value-1] = -arr[value-1];
			}
		}
		return lists;
	}

}

package com.Array.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		
		int[]arr = new int[] {1,1,2,1,4,5,4};
		removeduplicate(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = removedupli(arr);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void removeduplicate(int[]arr) {
		
		int[]num = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int m =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[m]==arr[j]) {
				arr[j] = 0;
				}
			}
		}
	}
	
	public static int[] removedupli(int[]num) {
		Arrays.sort(num);
		int pre = num[0];
		num[0] = pre;
		
		for(int i = 1;i<num.length;i++) {
			int ch = num[i];
			
			if(pre!=ch) {
				num[i] = ch;
			}
			pre = ch;
		}
		return num;
	}

}

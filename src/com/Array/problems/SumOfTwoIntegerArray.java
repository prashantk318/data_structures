package com.Array.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIntegerArray {
	public static void main(String[] args) {
		int[]arr = new int[] {1,2,3,4,5,6};
		int[] arrs = array(arr, 9);
		System.out.println(Arrays.toString(arrs));
		int[] arrs2 = arraysUsingMap(arrs, 9);
		System.out.println(Arrays.toString(arrs2));
	}
	
	
	public static int[] arraysUsingMap(int[]arrs, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int count =0;
		
		for(Integer num:arrs) {
			count++;
			map.put(num, count);
		}
		
		for(Map.Entry<Integer, Integer>maps:map.entrySet()) {
			if(map.containsKey(maps.getKey())) {
				int second = target - maps.getKey();
				return new int[] {maps.getKey(), second};
			}
		}
		
		return null;
	}
	
	public static int[] array(int[]arr, int target) {
		for(int i=0;i<arr.length;i++) {
			int f = arr[i];
			for(int j = i+1;j<arr.length;j++) {
				int s = arr[j];
				if(target == f+s) {
					System.out.println(s + " "+f);
					return new int[] {f,s};
				}
				
			}
		}
		return null;
	}

}

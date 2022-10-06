package com.Array.problems;

import java.util.HashSet;

import java.util.Set;

public class SingleNumberfrequency {
	public static void main(String[] args) {
		int []arr = {1,1,2,4,2};
		int s =	singlyNumberFrequency(arr);
		System.out.println(s);
	}
	
	public static int singlyNumberFrequency(int[]arr) {
		Set<Integer>sets = new HashSet<>();
		if(arr.length==1) {
			return arr[0];
		}
		for(int i=0;i<arr.length;i++) {
			if(sets.contains(arr[i])) {
				sets.remove(arr[i]);
			}else {
				sets.add(arr[i]);
			}
		}
		return sets.iterator().next();
	}

}

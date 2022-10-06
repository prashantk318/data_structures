package com.Array.problems;

public class FindLargestAndSmallestNumber {
public static void main(String[] args) {
	int[]arr = {1,2,4,5,6,7,2};
	findNumbers(new int[]{-20, 34, 21, -87, 92});
}

public static void findNumbers(int[]arr) {
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		for(int num:arr) {
			if(num>max) {
				max = num;
			}else if(num<min) {
				min = num;
			}
		}
		
	}
	System.out.println(min+" "+max);
	
	
}
}

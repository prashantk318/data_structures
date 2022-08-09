package com.tree;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[]num1 = new int[6];
		int[]num2 = new int[4];
		num2[0]=1;
		num2[1]=2;
		num2[2]=3;
		num2[3]=4;
		num1[0]=5;
		num1[1]=6;
		
	merge(num1, num2, 2, 4);
		
		
	}
	
	public static void merge(int[]arr1,int[]arr2, int m, int n) {
		int p1 = m-1;
		int p2 = n-1;
		for(int i = arr1.length-1;i>=0;i--) {
			int valueAtp1 = p1>= 0?arr1[p1]:Integer.MIN_VALUE;
			int valueAtp2 = p2>= 0?arr2[p2]:Integer.MIN_VALUE;
			if(valueAtp1>valueAtp2) {
				arr1[i]=valueAtp1;
				p1--;
			}else {
				arr1[i]=valueAtp2;
				p2--;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}

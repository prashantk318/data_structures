package com.Array.problems;

import java.util.Arrays;

public class NextArrayPermutation {
	public static void main(String[] args) {
		int[]num = {1,2,3,4};
	NextArrayPermutation p = new NextArrayPermutation();
	p.nextPermutation(num);
	}
	
	public void nextPermutation(int[]num) {
		int i = num.length -2;
		while(i>=0 && num[i+1]<=num[i]) {
			i--;
		}
		if(i>=0) {
			int j = num.length-1;
			while(num[j]<=num[i]) {
				j--;
			}
			swap(num,i,j);
		}
		
		reverse(num, i+1);
		System.out.println(Arrays.toString(num));
	}

	private void reverse(int[] num, int start) {
		// TODO Auto-generated method stub
		int i = start; int j=num.length-1;
		while(j>i) {
			swap(num, i, j);
			j--;
			i++;
		}
	}

	private void swap(int[] num, int i, int j) {
		// TODO Auto-generated method stub
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		
	}
	
	

}

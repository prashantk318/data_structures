package com.Array.problems;

public class MissingPositiveIntegerRepeat {
	public static void main(String[] args) {
		int ar = missingPositveInt(new int[] {1,2,3});
		System.out.println(ar);
		
	}
	
	public static int missingPositveInt(int[]arr) {
		if(arr.length ==0) {
			return 1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr.length || arr[i]<=0) {
				i++;
			}else if(arr[arr[i]-1]==arr[i]) {
				i++;
			}else {
				int temp = arr[arr[i]-1];
				arr[arr[i]-1] = arr[i];
				arr[i] = temp;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1)
				return i+1;
		}
		
		return arr[arr.length-1]+1;
	}

}

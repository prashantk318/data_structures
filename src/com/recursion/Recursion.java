package com.recursion;

public class Recursion {
	public static void main(String[] args) {
		int results = fun(8);
		System.out.println(results);
	}
	
	public static int fun(int n) {
		if(n<0) {
			return 0;
		}
		
		if(n==0 || n==1) {
			return 1;
		}
		
		return n*fun(n-1);
	}

}

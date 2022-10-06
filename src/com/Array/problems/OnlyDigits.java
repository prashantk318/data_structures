package com.Array.problems;

public class OnlyDigits {
	public static void main(String[] args) {
		
		String str = "1234";
		String g= "Prashant";
		int n = str.length();
		System.out.println(onlydigits(str, n));
	}
	
	
	public static boolean onlydigits(String str,int n) {
		for(int i=0;i<n;i++) {
			if(str.charAt(i)<'0'|| str.charAt(i)>'9') {
				return false;
			}
		}
		return true;
	}

}

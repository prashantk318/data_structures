package com.String.problems;

import java.util.Arrays;

public class longestCommonPrefixString {
	public static void main(String[] args) {
		String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
		String big = longestCommonPrefix(input);
		System.out.println(big);
	}
	
	public static String longestCommonPrefix(String[]str) {
		int size = str.length;
		if(size==0)
			return null;
		if(size==1)
			return str[0];
		Arrays.sort(str);
		int lenght = Math.min(str[0].length(), str[size-1].length());
		
		int i=0;
		while(i<lenght&&str[0].charAt(i)==str[size-1].charAt(i)) 
			i++;
			String pre = str[0].substring(0, i);
			return pre;
		
	}

}

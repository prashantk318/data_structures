package com.String.problems;

import com.LinkedList.Problems.IsPalindrome;

public class IsStringPalindrome {
	public static void main(String[] args) {
		String m ="Prashant";
		IsStringPalindrome d = new IsStringPalindrome();
		String ll = d.reverse(m);
		System.out.println(ll);
		
		boolean hh = d.isPalindrome("aaa");
		System.out.println(hh);
	}
	
	public boolean isPalindrome(String p) {
		String b = reverse(p);
		if(p.equals(b))
			return true;
		
		return false;
	}
	
	String m =" ";
	public String reverse(String input) {
		if(input.length()==0 || input == null)
			return input;
		/*
		 * for(int i = input.length()-1;i>=0;i--){ m = m+input.charAt(i); } return m;
		 */
		
		return input.charAt(input.length() -1) + reverse(input.substring(0, input.length()-1));
	}
}

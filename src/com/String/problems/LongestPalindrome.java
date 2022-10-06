package com.String.problems;

public class LongestPalindrome {
	public static void main(String[] args) {
		String p = "abballssn";
		LongestPalindrome d = new LongestPalindrome();
		String g = d.logestPalindrome(p);
		System.out.println(g);
		
	}
	
	int start =0; int end = 0;
	public String logestPalindrome(String s) {
		
		for(int i=0;i<s.length();i++) {
			expandAroundCetre(s,i,i);
			expandAroundCetre(s,i,i+1);
		}
		
		return s.substring(start , end+1);
	}

	private void expandAroundCetre(String s, int left, int right) {
		// TODO Auto-generated method stub
		while(left >=0&& right<s.length()&& s.charAt(right)==s.charAt(left)) {
			left--;
			right++;
		}
		left = left+1;
		right = right-1;
		if(end-start+1<right-left+1) {
			start = left;
			end = right;
		}
		
	}

}

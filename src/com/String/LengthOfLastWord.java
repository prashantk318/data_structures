package com.String;

public class LengthOfLastWord {
	public static void main(String[] args) {
		LengthOfLastWord n = new LengthOfLastWord();
		int number = n.lengthOflastWord("Harsha, Sneha");
		System.out.println(number);
	}
	
	public int lengthOflastWord(String s) {
		int right = s.length()-1;
		while(right>=0 && s.charAt(right)==' ') {
			right--;
		}
		int left = right;
		while(left>=0&& s.charAt(left)!=' ') {
			left--;
		}
		
		return right-left;
	}

}

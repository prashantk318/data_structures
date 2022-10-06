package com.String.problems;

import java.util.Arrays;

public class IsStringAnagram {
	public static void main(String[] args) {
		
	}
	
	
	public boolean isAnagram(String word, String anagram) {
		if(word.length() != anagram.length()) {
			return false;
		}
		
		char[] ch = word.toCharArray();
		
		for(char c:ch) {
			int index = word.indexOf(c);
			if(index !=-1) {
				anagram = anagram.substring(0, index)+ anagram.substring(index+1, anagram.length());
			}else {
				return false;
			}
		}
		
		return anagram.isEmpty();
	}
	
	public static boolean checkAnagram(String first, String second) {
		char[]ch = first.toCharArray();
		StringBuilder b = new StringBuilder(second);
		
		for(char c:ch) {
			int index = first.indexOf(c+"");
			if(index !=-1) {
				b.deleteCharAt(index);
			}
		}
		
		return second.length()==0?true:false;
	}
	
	public boolean isAnagram1(String first, String last) {
		if(first.length()!=last.length())
			return false;
		char[] f = first.toCharArray();
		char[]s = last.toCharArray();
		Arrays.sort(f);
		Arrays.sort(s);
	return	Arrays.equals(f,s);
	}

}

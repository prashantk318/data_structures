package com.String.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacterInString {
	public static void main(String[] args) {
	char v=	firstNonRepeatingChar("hello");
	char p= firstNonRepeatinghChar("Hello");
	System.out.println(p);
	System.out.println(v);
		
	}
	
	public static  char firstNonRepeatingChar(String str) {
		char value=0;
		Map<Character, Integer>maps = new LinkedHashMap<>(str.length());
		for(char ch:str.toCharArray()) {
			maps.put(ch, maps.containsKey(ch)?maps.get(ch)+1:1);
		}
		
		for(Map.Entry<Character, Integer>m:maps.entrySet()) {
			if(m.getValue()==1) {
				value = m.getKey();
				return value;
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");

	}
	
	public static char firstNonRepeatinghChar(String str) {
		Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(repeating.contains(ch)) {
				continue;
			}
			if(nonRepeating.contains(ch)) {
				nonRepeating.remove((Character)ch);
				repeating.add(ch);
			}else {
				nonRepeating.add(ch);
			}
		}
		
		return nonRepeating.get(0);
	}

}

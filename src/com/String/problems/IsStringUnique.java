package com.String.problems;

import java.util.HashMap;
import java.util.Map;

public class IsStringUnique {
	public static void main(String[] args) {
		
		System.out.println(isunique("Prr"));
	}
	
	public static boolean isunique(String m) {
		
		char[] ch = m.toCharArray();
		int count =0;
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i], count++);	
		}
		
		for(Map.Entry<Character, Integer>maps:map.entrySet()) {
			if(map.containsKey(maps.getKey()))
			if(maps.getValue()>1) {
				return false;
			}
		}
		return true;
	}

}

package com.String;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		boolean result = isUnique("ha");
		System.out.println(result);
	}
	
	public static boolean isUnique(String word) {
		char ch[] = word.toCharArray();
		
		Map<Character, Integer>maps = new HashMap<>();
		for(char c:ch) {
			if(maps.containsKey(c)) {
				maps.put(c, maps.get(c)+1);
			}else {
				maps.put(c, 1);
			}
			
		}
		for(Map.Entry<Character, Integer>map:maps.entrySet()) {
			if(map.getValue()>1) {
				return false;
			}
		}
		
		return true;
	}
	

}

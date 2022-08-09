package com.String;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		boolean result = isUnique("ha");
		System.out.println(result);
		Map<Character, Integer>map = new HashMap<>();
		String name = "Prashant";
		char[]ch = name.toCharArray();
		int counter=0;
		for(int i=0;i<ch.length;i++) {
			counter++;
			map = new HashMap<>();
			map.put(ch[i], counter);
		}
		for(Map.Entry<Character, Integer>maps:map.entrySet()) {
			System.out.println("key values for number of times"+" "+maps.getValue());
		}
		
		StringBuilder build = new StringBuilder();
		build.append("Hello");
		char chw = build.charAt(0);
		
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
		/*
		 * for(Map.Entry<Character, Integer>map:maps.entrySet()) { if(map.getValue()>1)
		 * { return false; } }
		 */
		
		long count = maps.entrySet().stream().filter(s ->s.getValue()>1).count();
		if(count>1) {
			return false;
		}
		
		
		return true;
	}
	

}

package com.String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class RepeatedDNASequence {
	
	public static void main(String[] args) {
		
	}
	
	public static List<String> repeatedDNAsequence(String s) {
		Map<String, Integer>maps = new HashMap<>();
		List<String>stringvalues =null;
		for(int i=0;i<s.length()-10;i++) {
			String sp = s.substring(i,i+10);
			maps = new HashMap<>();
			maps.put(sp, maps.get(sp)+1);
		}
		
		for(Map.Entry<String, Integer>map:maps.entrySet()) {
			if(map.getValue()>1) {
				stringvalues.add(map.getKey());
			}
		}
		
		return stringvalues;
	}

}

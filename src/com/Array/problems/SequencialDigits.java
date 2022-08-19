package com.Array.problems;

import java.util.ArrayList;
import java.util.List;

public class SequencialDigits {
	public static void main(String[] args) {
		List<Integer>lists = sequencialDigits(100, 300);
		for(Integer l:lists) {
			System.out.println(l);
		}
	}
	
	public static List<Integer>sequencialDigits(int low, int high){
		List<Integer>results = new ArrayList<>();
		String digits = "123456789";
		
		for(int i=1;i<=9;i++) {
			for(int j =0;j+i<digits.length();j++) {
				String value = digits.substring(j,i+j);
				int values = Integer.parseInt(value);
				
				if(values>=low && values<=high) {
					results.add(values);
				}
			}
		}
		
		return results;
	}

}

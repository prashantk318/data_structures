package com.String.problems;

import java.util.ArrayList;
import java.util.List;

public class StringPermuations {
	public static void main(String[] args) {
		String d = "Sneha";
		List<String>f = new ArrayList<>();
		permutations(f, d);
	}
	
	public static  void permutations(List<String>m, String s) {
		String ans = "";
		String remain ="";
		
		  if(remain.length()==0) {
			  for(String h:m) { 
				  
				  System.out.println(m); } }
		 
		
		for(int i=0;i<s.length()-1;i++) {
			//int j = i;
			 ans = s.substring(i, i+2);
			 remain = s.substring(0,i)+s.substring(i+1,s.length());
			 m.add(ans);
			 permutations(m, remain);
			 
		}
		
		
	}

}

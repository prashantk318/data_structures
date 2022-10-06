package com.String.problems;

import java.util.regex.Pattern;

public class IsStringNumeric {
	public static void main(String[] args) {
		
		String[] arr = new String[] {"123","145","Prashant","ss"};
		
		Pattern p = Pattern.compile(".*[^0-9]*.");
		
		for(String r:arr) {
			System.out.println("Thsi Number is"+r+"true or False"+"  "+p.matcher(r).matches());
		}
		
	}
	
	

}

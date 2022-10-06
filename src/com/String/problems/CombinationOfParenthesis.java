package com.String.problems;

import java.util.ArrayList;
import java.util.List;


public class CombinationOfParenthesis {
	public static void main(String[] args) {
		CombinationOfParenthesis s = new CombinationOfParenthesis();
		List<String>l = s.generate(9);
		for(String m:l) {
			System.out.println(m);
		}
		
	}
	public  List<String>generate(int n){
		List<String>combination = new ArrayList<>();
		generatePrenthesis(new char[2 * n],0, combination);
		return combination;
	}
	public void generatePrenthesis(char[]current, int pos, List<String>result) {
		
		if(pos == current.length) {
			if(isValid(current)) 
				result.add(new String(current));
		}	else {
			current[pos] = '(';
		generatePrenthesis(current, pos+1, result);
		current[pos] = ')';
		generatePrenthesis(current, pos+1, result);
	}}
	
	
	public boolean isValid(char[]ch) {
		int balance =0;
		for(char c:ch) {
			if(c=='(')
				balance++;
			else
				balance--;
			if(balance<0) {
				return false;
			}
		}
		 return (balance == 0);
	}

}

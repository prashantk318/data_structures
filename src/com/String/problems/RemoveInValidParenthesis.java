package com.String.problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.stack.Array.Stack;

public class RemoveInValidParenthesis {
	public static void main(String[] args) {
		String str = "(abc))";
		removeInvalidParenthesis(str);
	}
	
	
	static boolean isParenthesis(char c) {
		return (c=='('|| c==')');
	}
	static boolean isValidString(String str) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(')
				count++;
			if(str.charAt(i)==')')
				count--;
			if(count<0)
				return false;
		}
		return count==0;
	}
	
	static void removeInvalidParenthesis(String str) {
		if(str.isEmpty()) {
			return;
		}
		Set<String>visited = new HashSet<>();
		Queue<String>q = new LinkedList<>();
		String temp;
		visited.add(str);
		q.add(str);
		boolean level = false;
		while(!q.isEmpty()) {
			str = q.peek();q.remove();
			if(isValidString(str)) {
				System.out.println(str);
				level = true;
			}
			if(level) {
				continue;
			}
			for(int i=0;i<str.length();i++) {
				if(!isParenthesis(str.charAt(i))) {
					continue;
				}
				
				temp = str.substring(0,i)+str.substring(i+1);
				if(!visited.contains(temp)) {
					q.add(temp);
					visited.add(temp);
				}
			}
		}
		
		
		
		
		
	}

}

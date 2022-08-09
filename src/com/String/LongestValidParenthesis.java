package com.String;

import java.util.Stack;

public class LongestValidParenthesis {
	public static void main(String[] args) {
		int logestParenthesis = longestParenthesis("(He)l(lo)");
		System.out.println(logestParenthesis);
		
	}
	
public static  int longestParenthesis(String s) {
		int ans =0;
		int len = s.length();
		Stack<Integer>stack = new Stack<>();
		stack.push(-1);
		for(int i=0;i<len;i++) {
			char ch = s.charAt(i);
			if(ch=='(') {
				stack.push(i);
			}else {
				stack.pop();
				if(stack.size()==0) {
					stack.push(i);
				}else {
					ans = Math.max(ans, i-stack.peek());
				}
			}
		}
		return ans;
	}

}

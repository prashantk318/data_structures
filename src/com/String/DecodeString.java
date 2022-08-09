package com.String;

import java.util.Stack;

public class DecodeString {
	public static void main(String[] args) {
		String h = decodeString("3[2[ac]]");
		System.out.println(h);
	}
	
	public static String decodeString(String s) {
		Stack<Integer>numStack = new Stack<>();
		Stack<String>strStack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		for(int i=0;i<len;i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				int num = ch -'0';
				while(i+1<len&&Character.isDigit(s.charAt(i+1))) {
					num = num*10+s.charAt(i+1)-'0';
					i++;
				}
				numStack.push(num);
			}else if(ch=='[') {
				strStack.push(sb.toString());
				sb = new StringBuilder();
			}else if(ch==']') {
				int k = numStack.pop();
				StringBuilder temp = new StringBuilder(strStack.pop());
				for(int j=0;j<k;j++) {
					temp.append(sb);
				}
				temp = sb;
			}else {
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}

}

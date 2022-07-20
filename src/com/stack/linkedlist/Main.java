package com.stack.linkedlist;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		boolean result = stack.isEmpty();
		System.out.println(result);
		int value = stack.pop();
		System.out.println(value);
		//int value1 = stack.peek();
		//System.out.println(value1);
		stack.deleteStack();
		int value1 = stack.peek();
		System.out.println(value1);
		
	}

}

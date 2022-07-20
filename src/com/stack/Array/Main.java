package com.stack.Array;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		boolean result = stack.isEmpty();
		System.out.println(result);
		System.out.println(stack.isFull());
		stack.push(1);
		stack.push(2);
		stack.push(1);
		stack.push(2);
		int topdeleted = stack.pop();
		System.out.println("top element is deleted"+" "+topdeleted);
		int top = stack.peek();
		System.out.println("top element is"+" "+top);
		stack.deleteStack();
	}

}

package com.stack.Array;

public class Stack {
	int []arr;
	int topOfStack;
	
	public Stack(int size) {
		this.arr = new int[size];
		topOfStack = -1;
		System.out.println("stack is created with size"+" "+size);
	}
	public boolean isEmpty() {
		if(topOfStack==-1) {
			return true;
			}else {
				return false;
			}
		}
	
	public boolean isFull() {
		if(topOfStack == arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("The stack is Full");
			return;
		}else {
			arr[topOfStack+1] = value;
			topOfStack++;
			System.out.println(value+" "+"value is successfully inserted");
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int topStack = arr[topOfStack];
			topOfStack--;
			return topStack;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int topElement = arr[topOfStack];
			return topElement;
		}
	}
public void deleteStack() {
	arr =null;
	System.out.println("stack successfully deleted");
}
}

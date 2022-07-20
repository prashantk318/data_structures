package com.stack.linkedlist;

public class Stack {
	SinglyLinkedList list = new SinglyLinkedList();
	
	public Stack() {
		list = new SinglyLinkedList();
	}
	
	public void push(int value) {
		list.insertLinkedList(value, 0);
		System.out.println("inserted"+" "+value+" "+"successfully");
	}
	
	public boolean isEmpty() {
		if(list.head ==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int result =list.head.data;
			list.deletionOfNode(0);
			return result;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
			}else {
				int result =list.head.data;
				return result;
			}
		
	}
	
	public void deleteStack() {
		list.head = null;
		System.out.println("LinkedStack deleted Successfully");
	}

}

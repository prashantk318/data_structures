package com.LinkedList.SinglyLinkedList;

import java.util.Stack;

public class SumLinkedList {
	//sum of of tow linkedList in which each digit is stored in Node
	
	public Node addTwoNumber(Node node1, Node node2) {
		Stack<Integer>stack1 = new Stack<Integer>();
		while(node1 !=null) {
			stack1.push(node1.data);
			node1 = node1.next;
		}
		Stack<Integer>stack2 = new Stack<Integer>();
		while(node1 !=null) {
			stack2.push(node2.data);
			node2 = node2.next;
		}
		int carry =0;
		Node head = null;
		
		while(!stack1.isEmpty()|| !stack2.isEmpty()||carry !=0){
			int n1 = stack1.isEmpty()?0:stack1.pop();
			int n2 = stack2.isEmpty()?0:stack2.pop();
			int temp = n1+n2+carry;
			Node newNode = new Node(temp%10);
			newNode.next = head;
			head = newNode;
			carry = temp/10;
		}
		
		return head;
		
	}

}

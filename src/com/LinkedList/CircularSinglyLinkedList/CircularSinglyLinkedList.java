package com.LinkedList.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	public Node createcSLL(int nodeValue) {
		
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}
public void insertinCSLL(int nodeValue, int location) {
	Node node = new Node();
	node.value = nodeValue;
	if(head==null) {
		createcSLL(nodeValue);
	}
	else if(location ==0) {
		node.next = head;
		head = node;
		tail.next = node;
	}else if(location >=size) {
		node.next = tail.next;
	tail.next = node;
	tail = node;
		
	}else {
		Node tempNode = head;
		int index = 0;
		while(index <location -1) {
			tempNode = tempNode.next;
			index++;
		}
		
		node.next = tempNode.next;
		tempNode.next = node;
	}
	size++;
	
}


public void traverseCircularLinkedList() {
	if(head==null) {
		System.out.println("Ciruclar SinglyList does not exists");
	}else {
		Node tempNode = head;
		for(int i=0; i<size;i++) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
			if(i !=size-1) {
				System.out.println("->");
			}
		}
		System.out.println("\n");
		
	}
}

boolean searchNode(int nodeValue) {
	if(head !=null) {
		Node tempNode = head;
		for(int i =0; i<size;i++) {
			if(tempNode.value == nodeValue) {
				System.out.println("value exist at index"+" "+i);
				return true;
			}
		}
	}
		System.out.println("value does nto exists");
		return false;
}
public void deleteNode(int location) {
	if(head == null) {
		System.out.println("Circular Singly linked list does not exists");
		return;
	}else if(location == 0) {
		head = head.next;
		tail.next = head;
		size--;
		if(size==0) {
			tail = null;
			head.next = null;
			head = null;
		}
	}else if(location >=size) {
		Node tempNode = head;
		for(int i =0; i<size-1;i++) {
			tempNode = tempNode.next;	
		}
		if(tempNode == head) {
			head.next = null;
			tail = head = null;
			return;
			
		}
		tempNode.next = head;
		tail = tempNode;
		size--;
	}else {
		Node tempNode = head;
		for(int i =0; i<location-1;i++) {
			tempNode = tempNode.next;	
		}
		tempNode.next = tempNode.next.next;
		size--;
	}
}

public void deleteCSLL() {
	if(head==null) {
		System.out.println("Circular singly linked list does not exists");
	}else {
		head = null;
		tail.next = null;
		tail = null;
		System.out.println("The CSLL has been deleted");
	}
}
}

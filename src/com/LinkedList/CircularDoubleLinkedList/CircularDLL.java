package com.LinkedList.CircularDoubleLinkedList;

public class CircularDLL {
	Node head;
	Node tail;
	int size;
	
	public Node createNode(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		head = node;
		tail = node;
		node.next = node;
		node.previous = node;
		size =1;
		return head;	
	}
	
	public void inserNode(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if(head ==null) {
			createNode(nodeValue);
			return;
		}
		else if(location == 0) {
			node.previous = tail;
			node.next = head;
			head.previous = node;
			tail.next = node;
			head = node;
			
		}else if(location >=size) {
			 node.next = head;
			 node.previous = tail;
			 head.previous = node;
			 tail.next = node;
			 tail = node;
		}else {
			Node tempNode = head;
			int index =0;
			while(index < location-1) {
				tempNode = tempNode.next;
				index++;
			}
			
	node.next = tempNode.next;
	node.previous = tempNode;
	tempNode.next = node;
	node.next.previous = node;
			
		}
		size++;
	}
	
	public void travserNode() {
		if(head !=null) {
		Node tempNode = head;
		for(int i=0;i<size;i++) {
			System.out.println(tempNode.value);
			
			if(i !=size) {
				System.out.println("->");
			}
			tempNode = tempNode.next;
			
		}
		}
		else {
			System.out.println("Circular double linked list does not exists");
		}
	}
	
	boolean searchNode(int nodeValue) {
		if(head != null) {
			Node tempNode = head;
			for(int i =0; i<size;i++) {
				if(tempNode.value == nodeValue) {
					System.out.println("Value found at location"+" "+i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
			System.out.println("value does not exist");
			return false;
		
	}
	
	public void deleteCDLL(int location) {
		if(head == null) {
			System.out.println("CDLL does not exist");
			return;
		}else if(location ==0) {
			if(size==1) {
			head.previous = null;
			head.next = null;
			head = null;
			tail = null;
			size--;
			return;
			}
			head = head.next;
			head.previous = tail;
			tail.next = head;	
			size--;
		}else if(location >=size) {
			if(size==1) {
				head.previous = null;
				head.next = null;
				head = null;
				tail = null;
				size--;
				return;
			}
			tail = tail.previous;
			tail.next = head;
			head.previous = tail;
			size--;
		}else {
			Node tempNode = head;
			for(int i =0; i<location-1;i++) {
				tempNode = tempNode.next;
			}
			
			tempNode.next = tempNode.next.next;
			tempNode.next.previous = tempNode;
			size--;
		}
		
	
	}
	
	public void deleteCDLL() {
		Node tempNode = head;
		for(int i =0; i<size;i++) {
			tempNode.previous = null;
			tempNode = tempNode.next;
		}
		head = null;
		tail = null;
		System.out.println("The circular doublylinked list completely deleted");
	}

}

package com.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
	 Node head;
	 Node tail;
	 int size;
	 
	 DoublyLinkedList(){
		 head = null;
		 tail = null;
		 size=0;
	 }
	 
	 public Node createNode(int nodeValue) {
		 head = new Node();
		 Node node = new Node();
		 node.value = nodeValue;
		 node.previous = null;
		 node.next = null;
		 head = node;
		 tail = node;
		 size = 1;
		 return head;
	 }
	 
	 public void insertNodeDDL(int nodeValue, int location) {
		 Node node = new Node();
		 node.value = nodeValue;
		 if(head == null) {
			 createNode(nodeValue);
		 }else if(location == 0) {
			 node.next = head;
			 node.previous = null;
			 head.previous = node;
			 head = node;
		 }else if(location >=size) {
			 node.next = null;
			 node.previous = tail;
			 tail.next = node;
			 tail = node;
			
		 }else {
			 Node tempNode = head;
			 int index=0;
			 while(index <location -1) {
				 tempNode = tempNode.next;
				 index++;
			 }
			 
		node.next = tempNode.next;
		node.previous = tempNode;
		node.next.previous = node;
		tempNode.next = node;
			
		 }
		 size++;
	 }
	public void traverseDLL() {
	if(head !=null) {
		Node tempNode = head;
		for(int i = 0; i<size;i++) {
			System.out.println(tempNode.value);
			if(i !=size-1) {
				System.out.println("->");
			}
			tempNode = tempNode.next;
		}
	}else {
		System.out.println("Linkedlist does not exist");
	}
		
	}
	
	public boolean searchNode(int nodeValue) {
		if(head !=null) {
			Node tempNode = head;
			for(int i = 0; i<size;i++) {
				if(tempNode.value==nodeValue) {
					System.out.println("value found at location"+" "+i);
					return true;
				}
				tempNode = tempNode.next;
			}
			
		}
		System.out.println("node does not exists");
		return false;
		
	}
	
	public void deleteDLL(int location) {
		if(head==null) {
			System.out.println("DDL does not exists");
		}else if(location ==0) {
			if(size==1) {
				head = tail=null;
				size--;
				return;
			}else {
				head = head.next;
				head.previous = null;
				size--;
			}
		}else if(location >= size) {
			Node tempNode = tail.previous;
			if(size==1) {
				head=tail = null;
				size--;
				return;
			}else {
				tempNode.next = null;
				tail = tempNode;
				size--;
			}
			
		}
		
		else {
			Node tempNode = head;
			for(int i=0;i<location-1;i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.previous;
			tempNode.next.previous = tempNode;
			size--;
		}
	}
	
	public void deleteDLL() {
		Node tempNode = head;
		for(int i= 0; i<size;i++) {
			tempNode.previous = null;
			tempNode = tempNode.next;
		}
		
		head = null;
		tail = null;
		System.out.println("DLL has been deleted");
	}

}

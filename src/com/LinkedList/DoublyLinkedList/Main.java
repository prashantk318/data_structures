package com.LinkedList.DoublyLinkedList;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList dLL = new DoublyLinkedList();
		dLL.createNode(5);
		System.out.println(dLL.head.value);
		dLL.insertNodeDDL(10, 1);
		dLL.insertNodeDDL(20, 2);
		System.out.println(dLL.head.next.value);
		dLL.traverseDLL();
		dLL.searchNode(10);
	}

}

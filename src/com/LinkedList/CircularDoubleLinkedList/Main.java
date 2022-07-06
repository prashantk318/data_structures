package com.LinkedList.CircularDoubleLinkedList;

public class Main {
	public static void main(String[] args) {
		CircularDLL cDLL = new CircularDLL();
		cDLL.createNode(5);
		System.out.println(cDLL.head.value);
		cDLL.inserNode(10, 1);
		cDLL.inserNode(20, 2);
		System.out.println(cDLL.head.next.value);
		cDLL.travserNode();
		cDLL.searchNode(20);
		cDLL.deleteCDLL(1);
		cDLL.travserNode();
		cDLL.deleteCDLL();
		cDLL.travserNode();
	}

}

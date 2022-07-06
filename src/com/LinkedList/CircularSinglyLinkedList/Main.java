package com.LinkedList.CircularSinglyLinkedList;

public class Main {
	public static void main(String[] args) {
		CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
		cSLL.createcSLL(1);
		cSLL.insertinCSLL(5, 0);
		cSLL.insertinCSLL(11, 1);
		cSLL.insertinCSLL(13, 2);
		cSLL.insertinCSLL(14, 3);
		//System.out.println(cSLL.head.next.next.next.value);
		cSLL.traverseCircularLinkedList();
		cSLL.searchNode(5);
		cSLL.deleteNode(1);
		cSLL.traverseCircularLinkedList();
		cSLL.deleteCSLL();
		cSLL.traverseCircularLinkedList();
	}

}

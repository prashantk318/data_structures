package com.LinkedList.SinglyLinkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList sLL = new SinglyLinkedList();
		Node node = sLL.createSinglyLinkedList(5);
		System.out.println(sLL.tail.data);
		System.out.println(sLL.size);
		//insert Method SinglyLinkedList
		sLL.insertLinkedList(10, 1);
		sLL.insertLinkedList(6, 2);
		sLL.insertLinkedList(25, 3);
		sLL.insertLinkedList(7, 4);
		sLL.insertLinkedList(11, 5);
		sLL.traverseSinglyLinkedList();
		sLL.searchNode(11);
		sLL.deletionOfNode(4);
		sLL.traverseSinglyLinkedList();
		sLL.deleteSLL();
		sLL.traverseSinglyLinkedList();
	}

}

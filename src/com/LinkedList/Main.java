package com.LinkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList sLL = new SinglyLinkedList();
		Node node = sLL.createSinglyLinkedList(5);
		System.out.println(sLL.tail.data);
		System.out.println(sLL.size);
		//insert Method SinglyLinkedList
		sLL.insertLinkedList(10, 1);
		System.out.println(sLL.head.next.data);
		
	}

}

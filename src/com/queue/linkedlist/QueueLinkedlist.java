package com.queue.linkedlist;

public class QueueLinkedlist {
	SinglyLinkedList list;
	
	public QueueLinkedlist() {
		list = new SinglyLinkedList();
		System.out.println("Queue is successfull created");
	}
	
	public boolean isEmpty() {
		if(list.head == null) {
			return true;
		}else {
			return false;
		}
	}
	public void enQueue(int value) {
		list.insertLinkedList(value, list.size);
		System.out.println("Successfull inserted"+ " "+value);
	}
	
	public int deQueue() {
		int value = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return value;
		}else {
			value = list.head.value;
			list.deletionOfNode(0);
		}
		return value;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			int value = list.head.value;
			return value;
		}
	}
	
	public void deleteQueue() {
		list.head = list.tail = null;
		System.out.println("Queueu is successfully deleted");
		
	}

}

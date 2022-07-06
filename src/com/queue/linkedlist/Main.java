package com.queue.linkedlist;

public class Main {
	public static void main(String[] args) {
		QueueLinkedlist list = new QueueLinkedlist();
		boolean result = list.isEmpty();
		System.out.println(result);
		list.enQueue(25);
		boolean b = list.isEmpty();
		System.out.println(b);
		int r = list.deQueue();
		System.out.println(r);
	}

}

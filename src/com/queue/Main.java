package com.queue;

public class Main {
	public static void main(String[] args) {
		QueueArray arr = new QueueArray(5);
		System.out.println(arr.isFull());
		System.out.println(arr.isEmpty());
		arr.enQueue(10);
		arr.enQueue(25);
		int result = arr.deQueue();
		System.out.println(result);
		
	}

}

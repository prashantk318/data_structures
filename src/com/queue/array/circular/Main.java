package com.queue.array.circular;

public class Main {
	public static void main(String[] args) {
		CircularQueue arr = new CircularQueue(5);
		boolean result = arr.isEmpty();
		System.out.println(result);
		boolean result1 = arr.isFull();
		System.out.println(result1);
		arr.enQueue(20);
		arr.enQueue(30);
		arr.enQueue(40);
		arr.enQueue(50);
		arr.enQueue(60);
		//arr.enQueue(70);
	int result2 = arr.deQueue();
	int result3 = arr.deQueue();
	System.out.println(result2);
	System.out.println(result3);
	int result4 = arr.peek();
	System.out.println(result4);
	arr.deleteQueue();
	}

}

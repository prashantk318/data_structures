package com.queue.array.circular;

public class CircularQueue {
	int topOfQueue;
   int[]arr;
   int beginingOfQueue;
   int size;
   public CircularQueue(int size) {
	// TODO Auto-generated constructor stub\\
	   this.topOfQueue = -1;
	   this.beginingOfQueue = -1;
	   this.size = size;
	   this.arr = new int[size];
	   System.out.println("Circular Queue is successfully created with size of"+size);
}
   
   public boolean isEmpty() {
	   if(topOfQueue == -1) {
		   return true;
	   }else {
		   return false;
	   }
   }
   public boolean isFull() {
	   if(topOfQueue+1 == beginingOfQueue) {
		   return true;
	   }else if(beginingOfQueue ==0 && topOfQueue+1 == size) {
		   return true;
	   }else {
		   return false;
	   }
   }
   
   public void enQueue(int value) {
	   if(isFull()) {
		   System.out.println("Circular Queue is full");
	   }else if(isEmpty()) {
		   beginingOfQueue = 0;
		   topOfQueue++;
		   arr[topOfQueue]= value;
		   System.out.println("value successfully inserted"+" "+value);
	   }else {
		   if(topOfQueue+1 == size) {
			   topOfQueue =0;
		   }else {
			   topOfQueue++;
		   }
		   arr[topOfQueue]= value;
		   System.out.println("value successfully inserted"+" "+value);
	   }   
   }
   
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;	
		}else {
			int result = arr[beginingOfQueue];
			arr[beginingOfQueue] = 0;
			if(beginingOfQueue == topOfQueue) {
				beginingOfQueue = topOfQueue = -1;
			}else if (beginingOfQueue+1 == size){
				beginingOfQueue =0;
			}else {
				beginingOfQueue++;
			}
			return result;
		}
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}else {
			return arr[beginingOfQueue];
		}
	}
	
	public void deleteQueue() {
		arr=null;
		System.out.println("Queue is completely deleted");
	}
}

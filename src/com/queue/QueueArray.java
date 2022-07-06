package com.queue;

public class QueueArray {
	int[]arr;
	int topOfQueue;
	int begininingofQueue;
	
  public QueueArray(int size) {
	  this.arr = new int[size];
	  this.topOfQueue = -1;
	  this.begininingofQueue = -1;
	  System.out.println("Queue is created with size"+" "+size);
  }
  
  public boolean isFull() {
	  if(topOfQueue == arr.length-1) {
		  return true;
	  }else {
		  return false;
	  }
  }
  
  public boolean isEmpty() {
	  if((begininingofQueue == -1)|| (begininingofQueue == arr.length)){
		  return true;
	  }else {
		  return false;
	  }
  }
  
  public void enQueue(int value) {
	  if(isFull()) {
		  System.out.println("queue is full");
	  }else if(isEmpty()) {
		  begininingofQueue = 0;
		  topOfQueue++;
		  arr[topOfQueue] = value;
		  System.out.println("Successfully inserted"+value+"in the Queue");
	  }else {
		  topOfQueue++;
		  arr[topOfQueue] = value;
		  System.out.println("Successfully inserted"+value+"in the Queue");
	  }
  }
  public int deQueue() {
	  if(isEmpty()) {
		  System.out.println("queue is empty");
		  return -1;
	  }else {
		  int result = arr[begininingofQueue];
		  begininingofQueue++;
		  if(begininingofQueue > topOfQueue) {
			  begininingofQueue = topOfQueue = -1;
		  }
		  return result;
	  }
  }
  
  
}

package com.countDownLatch;

public class CountDownLatch {

	public static void main(String[] args) {
		
	
	java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(4);
	WorkerThread worker1 = new WorkerThread(100, latch, "w1");
	WorkerThread worker2 = new WorkerThread(200, latch, "w2");
	WorkerThread worker3 = new WorkerThread(300, latch, "w3");
	WorkerThread worker4 = new WorkerThread(400, latch, "w4");
	worker1.start();
	worker2.start();
	worker3.start();
	worker4.start();
	try {
		latch.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()+"finished");
	}
}

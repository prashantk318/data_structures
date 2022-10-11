package com.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class WorkerThread extends Thread {
	
	CountDownLatch latch;
	int delay;
	String message;
	
public WorkerThread(int delay, CountDownLatch latch, String message) {
		super(message);
		this.latch = latch;
		this.delay = delay;
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		Thread.sleep(delay);
		latch.countDown();
		System.out.println(Thread.currentThread().getName()
                + " finished");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

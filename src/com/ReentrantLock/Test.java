package com.ReentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args) {
		ReentrantLock re = new ReentrantLock();
		ExecutorService s = Executors.newFixedThreadPool(2);
		Runnable r1 = new Worker(re, "w1");
		Runnable r2 = new Worker(re, "w2");
		Runnable r3 = new Worker(re, "w3");
		Runnable r4 = new Worker(re, "w4");
		s.execute(r1);
		s.execute(r2);
		s.execute(r3);
		s.execute(r4);
		s.shutdown();
	}

}

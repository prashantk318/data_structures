package com.deadlock;

public class DeadLock {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		Thread1 thread1 = new Thread1(s1,s2);
		Thread2 thread2 = new Thread2(s1,s2);
		Thread t1 = new Thread(thread1);
		t1.start();
		Thread t2 = new Thread(thread2);
		t2.start();
		Util.sleep(2000);
	}

}

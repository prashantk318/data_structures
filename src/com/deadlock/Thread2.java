package com.deadlock;

public class Thread2 extends Thread{
	private Shared s1;
	private Shared s2;
	
	
	public Thread2(Shared s1, Shared s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		s2.test1(s2);
	}
}

package com.Array.Threadgroup;

public class ThreadGroups extends Thread {
	
	public ThreadGroups(String threadName, ThreadGroup grp) {
		super(grp, threadName);
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			//System.out.println("thread name is "+getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.getSecurityManager();
		ThreadGroup gs = new ThreadGroup("Prashant");
		ThreadGroups g = new ThreadGroups("child", gs);
		System.out.println("One");
		ThreadGroups g1 = new ThreadGroups("child1", gs);
		System.out.println("Two");
		int count = g.activeCount();
		
		Thread[] thread = new Thread[count];
		int counts = gs.enumerate(thread, true);
		for(int i=0;i<counts;i++) {
			System.out.println(thread[i].getName());
		}
		System.out.println(count);
	}

}

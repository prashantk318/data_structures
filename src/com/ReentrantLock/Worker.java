package com.ReentrantLock;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
	ReentrantLock rel;
	String text;
	public Worker(ReentrantLock rel, String text) {
		super();
		this.rel = rel;
		this.text = text;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		boolean done = false;
		while(!done) {
			boolean ans = rel.tryLock();
			if(ans) {
				
				
				try {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("task name - "+ text
		                     + " outer lock acquired at "
		                     + ft.format(d)
		                     + " Doing outer work");
					Thread.sleep(1000);
					rel.lock();
					try {
						  d = new Date();
				            ft = new SimpleDateFormat("hh:mm:ss");
				            System.out.println("task name - "+ text
				                       + " inner lock acquired at "
				                       + ft.format(d)
				                       + " Doing inner work");
				            System.out.println("Lock Hold Count - "+ rel.getHoldCount());
				            Thread.sleep(1500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}finally {
						  System.out.println("task name - " + text +
			                       " releasing inner lock");
			 
			            rel.unlock();
					}
					 System.out.println("Lock Hold Count - " + rel.getHoldCount());
			          System.out.println("task name - " + text + " work done");
			 
			          done = true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					  System.out.println("task name - " + text +
			                     " releasing outer lock");
			 
			          rel.unlock();
			          System.out.println("Lock Hold Count - " +
			                       rel.getHoldCount());
				}
			}else {
				 System.out.println("task name - " + text +
	                      " waiting for lock");
		 
		          rel.unlock();
		          System.out.println("Lock Hold Count - " +
		                       rel.getHoldCount());
		          try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	

}

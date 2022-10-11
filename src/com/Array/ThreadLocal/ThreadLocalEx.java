package com.Array.ThreadLocal;

public class ThreadLocalEx extends Thread {
	
	@SuppressWarnings("unchecked")
	private static ThreadLocal<Integer>threadLocal = new ThreadLocal() {
		protected Object initialValue() {
			return new Integer(q--);
		}
	};
	
	private static int q = 15;
	
	ThreadLocalEx(String name){
		super(name);
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(getName()+" "+threadLocal.get());
		}
	}
	
	public static void main(String[] args) {
		ThreadLocalEx e = new ThreadLocalEx("p");
		ThreadLocalEx e1 = new ThreadLocalEx("q");
		ThreadLocalEx e2 = new ThreadLocalEx("r");
	}
	

}

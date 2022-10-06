package com.deadlock;

public class Util {
	
	static void sleep(int millis){
		try {
		Thread.sleep(millis);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}

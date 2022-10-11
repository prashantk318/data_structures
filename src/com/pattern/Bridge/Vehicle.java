package com.pattern.Bridge;

abstract class Vehicle {
	
	WorkShop w1;
	WorkShop w2;
	
	protected Vehicle(WorkShop w1, WorkShop w2) {
		this.w1 = w1;
		this.w2 = w2;
	}
	abstract public void manufacture();
}

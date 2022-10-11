package com.pattern.Bridge;

public class Bike extends Vehicle {

	protected Bike(WorkShop w1, WorkShop w2) {
		super(w1, w2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("bike");
		w1.work();
		w2.work();
	}

}

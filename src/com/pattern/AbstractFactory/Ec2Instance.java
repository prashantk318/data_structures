package com.pattern.AbstractFactory;

public class Ec2Instance implements Instance {

	
	public Ec2Instance(Capacity capacity) {
		System.out.println("Created E2Instance");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start of EC2Instance");
		
	}

	@Override
	public void attachStorage(Storage storage) {
		// TODO Auto-generated method stub
		System.out.println("Storage of Ec2Instance"+" "+storage);
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop of EC2Instance");
		
	}
	@Override
	public String toString() {
		return "Ec2Instance ";
	}
	
	

}

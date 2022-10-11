package com.pattern.Bridge;

public class Main {
	public static void main(String[] args) {
		Vehicle v2 = new Car(new Produce(), new Assemble());
		v2.manufacture();
	}

}

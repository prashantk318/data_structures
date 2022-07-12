package com.Hash.quadraticProbing;

public class Main {
	public static void main(String[] args) {
		QuadraticProbing probe = new QuadraticProbing(13);
		probe.insertInHashTable("Hi");
		probe.insertInHashTable("quick");
		probe.insertInHashTable("brown");
		probe.insertInHashTable("fox");
		probe.insertInHashTable("over");
		probe.displayHashtable();
	}

}

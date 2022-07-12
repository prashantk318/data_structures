package com.Hash.DoubleHashing;

public class Main {
	public static void main(String[] args) {
		DoubleHashing probe = new DoubleHashing(5);
		probe.insertInHashTable("The");
		probe.insertInHashTable("quick");
		probe.insertInHashTable("brown");
		probe.insertInHashTable("fox");
		probe.insertInHashTable("over");
		probe.displayHashtable();
		
	}

}

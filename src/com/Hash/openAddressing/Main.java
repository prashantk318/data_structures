package com.Hash.openAddressing;

public class Main {
	public static void main(String[] args) {
		LinearProbing probe = new LinearProbing(13);
		probe.insertInHashTable("The");
		probe.insertInHashTable("quick");
		probe.insertInHashTable("brown");
		probe.insertInHashTable("fox");
		probe.insertInHashTable("over");
		probe.displayHashtable();
		probe.searchHashTable("The");
		probe.deleteKeyHashTable("The");
		probe.displayHashtable();
	}
	

}

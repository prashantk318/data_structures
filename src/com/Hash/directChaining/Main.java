package com.Hash.directChaining;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	DirectChaining chain = new DirectChaining(15);
	chain.insertHashTable("The");
	chain.insertHashTable("quick");
	chain.insertHashTable("brown");
	chain.insertHashTable("fox");
	chain.insertHashTable("over");
	chain.displayHashtable();
	chain.searchhashTable("fox");
	chain.deleteKeyHashTable("fox");
	chain.displayHashtable();
}
}


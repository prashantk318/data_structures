package com.Hash.directChaining;

import java.util.LinkedList;

public class DirectChaining {
	LinkedList<String>[]hashTable;
	int maxChainSize=5;
	public DirectChaining(int size) {
		hashTable = new LinkedList[size];
	}
	
	public int modASCIIHashFuction(String word,int number) {
		char ch[];
		ch = word.toCharArray();
		int i, sum;
		for(sum =0, i=0;i<word.length();i++) {
			 sum = sum + ch[i];
		}
		return sum % number;
	}
	
	public void insertHashTable(String word) {
		int newIndex = modASCIIHashFuction(word, word.length());
		if(hashTable[newIndex] == null) {
			hashTable[newIndex] = new LinkedList<String>();
			hashTable[newIndex].add(word);
		}else {
			hashTable[newIndex].add(word);
		}
	}
	public void displayHashtable() {
		if(hashTable == null) {
			System.out.println("hastTable does not exists");
			return;
		}else {
			System.out.println("HastTable");
			for(int i =0;i<hashTable.length;i++) {
				System.out.println("Index"+i+"Key"+hashTable[i]);
			}
		}
	}
	public boolean searchhashTable(String word) {
		int newIndex = modASCIIHashFuction(word, word.length());
		if(hashTable[newIndex]!=null && hashTable[newIndex].contains(word)) {
			System.out.println(word+"found in hastable at location"+newIndex);
			return true;
		}else {
			System.out.println(word+" does not found in hastable at location"+newIndex);
			return false;
		}
	}
	
	public void deleteKeyHashTable(String word) {
		int newIndex = modASCIIHashFuction(word, word.length());
		boolean result = searchhashTable(word);
		if(result==true) {
			hashTable[newIndex].remove(word);
			System.out.println(word+"has been deleted"+newIndex);
		}
	}

}

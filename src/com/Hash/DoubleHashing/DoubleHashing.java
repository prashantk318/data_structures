package com.Hash.DoubleHashing;

import java.util.ArrayList;

public class DoubleHashing {
	String[]hashTable;
	int noOfCellsUsedInHashTable;
	DoubleHashing(int size){
		hashTable =new String[size];
		noOfCellsUsedInHashTable =0;
	}
	
	public int modASCIIHashFuction(String word,int number) {
		char ch[];
		ch = word.toCharArray();
		int sum =0;
		for(int i=0;i<word.length();i++) {
			sum = sum + ch[i];
		}
		return sum%number;
	}
	public void rehashKeys(String word) {
		noOfCellsUsedInHashTable =0;
		ArrayList<String>data = new ArrayList<>();
		for(String s:hashTable) {
			if(s!=null) {
				data.add(s);
			}
			data.add(word);
		   hashTable = new String[hashTable.length * 2];
		   for(String st:data) {
			   insertInHashTable(st);
			   
			   
		   }
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

	 void insertInHashTable(String word) {
		// TODO Auto-generated method stub
		double loadFactor = loadFactor();
		if(loadFactor>=0.75) {
			rehashKeys(word);
		}else {
			int index = modASCIIHashFuction(word, hashTable.length);
			int secondIndex = secondHashFunction(word, hashTable.length);
			for(int i=0;i<hashTable.length;i++) {
				int newIndex = (index+i*secondIndex)%hashTable.length;
				if(hashTable[newIndex]==null) {
					hashTable[newIndex]=word;
					System.out.println(word+"inserted at location"+newIndex);
					break;
				}else {
					System.out.println(newIndex+"already occupied:try next");
				}
			}
		}
		noOfCellsUsedInHashTable++;
		
	}
	private int  addAllDigitsTogether(int sum) {
		int value=0;
		while(sum>0) {
			value = sum %10;
			sum = sum/10;
		}
		return value;
	}
	public int secondHashFunction(String word, int number) {
		char ch[];
		ch = word.toCharArray();
		int i, sum =0;
		for(sum=0, i=0;i<word.length();i++) {
			sum = sum + ch[i];
		}
		while(sum > hashTable.length) {
			sum = addAllDigitsTogether(sum);
		}
		return sum%number;
	}
	public double loadFactor() {
		return noOfCellsUsedInHashTable*1.0/hashTable.length;
	}
	
	
}

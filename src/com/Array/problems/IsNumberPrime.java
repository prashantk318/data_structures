package com.Array.problems;

public class IsNumberPrime {
	public static void main(String[] args) {
		boolean prime = isPrime(2);
		System.out.println(prime);
	}
	
	public static boolean isPrime(int number) {
		
		int sqt = (int)Math.sqrt(number)+1;
		for(int i=2;i<sqt;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean iPrimeNumber(int number) {
		if(number==2|| number==3) {
			return true;
		}
		
		if(number%2==0) {
			return false;
		}
		
		int sqt = (int)Math.sqrt(number)+1;
		for(int i =3;i<sqt;i +=2) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
		
	}

}

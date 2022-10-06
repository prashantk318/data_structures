package com.Array.problems;

public class NumberIsPalindrome {
	public boolean isPalindrome(int x) {
		//if the number is a negative number
		//if the number end with 0 except the number zero
		if(x<0 ||(x !=0 && x%10==0)) {
			return false;
		}
		int num =x;
		int reverse =0;
		while(num>reverse) {
			int lastDigit = num%10;
			reverse = reverse*10+lastDigit;
			num = num/10;
		}
		return num == reverse/10 || num == reverse;
	}

}

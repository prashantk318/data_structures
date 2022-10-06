package com.Array.problems;

public class ReveseIntegerMaxToMin {
	public static void main(String[] args) {
		int reveseInt = reveseInteger(-122235555);
		System.out.println(reveseInt);
		
	}
	
	public static int reveseInteger(int x) {
		
		int reverse = 0;
	while(x !=0) {	
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int lastDigit = x%10;
		if(reverse>max/10 || reverse == max/10 && lastDigit >7 ) {
			return 0;
		}
		
		if(reverse<min/10 || reverse == min/10 && lastDigit<-8) {
			return 0;
		}
		
		reverse = reverse*10+lastDigit;
		
		x = x/10;
			
	}
	return reverse;
	}

}

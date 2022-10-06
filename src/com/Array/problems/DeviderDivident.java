package com.Array.problems;

public class DeviderDivident {
	
	public static void main(String[] args) {
		int b =divide(-7, -3);
		System.out.println(b);
	}
	public static int divide(int dividend, int divisor) {
		 if(dividend == Integer.MIN_VALUE&& divisor== -1){
	            return Integer.MAX_VALUE;
	        }
	        int neg = 2;
	        if(dividend>0){
	            neg--;
	            dividend = -dividend;
	        }
	        
	        if(divisor>0){
	            neg--;
	            divisor = -divisor;
	        }
	        
	        int sub =0;
	        while(dividend-divisor <= 0){
	            sub--;
	            dividend -= divisor;
	        }
	        
	        if(neg !=1){
	            sub = -sub;
	        }
	        return sub;
	    }
	}


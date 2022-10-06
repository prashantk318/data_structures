package com.Array.problems;

public class Pow {
	public static void main(String[] args) {
		 double value = mypow(2.0,-4);
		System.out.println(value);
	}

	public static double mypow(double x, int n) {
		double ans =1.0;
		int num = n;
		if(n<0) {
			num = -1*num;
		}
		
		while(n>0) {
			if(n%2==0) {
				x = x*x;
				n = n/2;
			}else {
				ans = ans*x;
				n = n-1;
			}
		}
		if(n<0) {
			return (double)(1.0)/(double)(ans);
		}
		return ans;
	}
}

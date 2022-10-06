package com.Knapsack.problem;

public class Knapsack_01 {
	public static void main(String[] args) {
		// input arrays  
		int values[] = new int[] { 100, 60, 120 };  
		int weight[] = new int[] { 20, 10, 30 };  
		// capacity of the knapsack  
		int C = 50;  
		// calculating the length  
		int length = values.length;  
		// instantiating the class KnapsackExample  
		Knapsack_01 knapObj = new Knapsack_01();  
		int maxVal = knapObj.knapsack(C, weight, values, length);  
		System.out.println("The maximum value is: " + maxVal);  
		}  
	
	
	public int knapsack(int C, int[]wt, int[]v, int l) {
		if(l==0 || C==0) {
			return 0;
		}
		
		if(C<wt[l-1]) {
		return	knapsack(C, wt, v, l-1);
		}else {
			int value1 = knapsack(C-wt[l-1], wt, v, l-1);
			
			int value2 = knapsack(C, wt, v, l-1);
			return max(v[l - 1] + value1, value2);  
		}
		
	}
	
	public int max(int max1, int max2) {
		return(max1>max2)?max1:max2;
	}

}

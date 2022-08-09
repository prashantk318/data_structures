package com.stack.Array;

public class MaxProfit {
	public static void main(String[] args) {
		int[] arr = {1,5,8,7,9};
		int profits = maxProfit(arr);
		System.out.println(profits);
				
	}
	
	public static  int maxProfit(int[]price) {
		if(price.length==1) {
			return 0;
		}
		int left =0;
		int profit=0;
		for(int right=1;right<price.length;right++) {
			if(price[right]>price[left]) {
				profit = Math.max(profit, price[right]-price[left]);
			}else {
				left=right;
			}
		}
		return profit;
	}

}

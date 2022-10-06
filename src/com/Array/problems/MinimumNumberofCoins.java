package com.Array.problems;

public class MinimumNumberofCoins {
	public static void main(String[] args) {
		int[]coin = new int[] {1,5,4,7,8};
		int m =numberOfcoins(coin, coin.length, 0);
		System.out.println(m);
	}
	



public static int numberOfcoins(int[]arr,int m, int value) {
	int res = 0;
	
	if(value==0)
		return 0;
	for(int i=0;i<m;i++) {
		if(arr[i]<=value) {
			res = numberOfcoins(arr, m, value-arr[i]);
		}
	}
	return res;
		
}


}

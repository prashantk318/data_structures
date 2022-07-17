package com.Array.TwoDimentional;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int [][] int2DArray;
		int2DArray = new int[2][2];
		int2DArray[0][0]= 1;
		int2DArray[0][1]= 2;
		int2DArray[1][0]= 3;
		int2DArray[1][1]= 4;
		System.out.println(Arrays.deepToString(int2DArray));
		
		String s2DArray[][] = {{"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(s2DArray));
		TwoDimentionalArray darr = new TwoDimentionalArray(3, 3);
		darr.insertValueinArray(0, 0, 20);
		darr.insertValueinArray(0, 1, 10);
		System.out.println(Arrays.deepToString(darr.arr));
		darr.accessCell(0, 0);
		darr.traverseToArray();
		darr.searchingValue(20);
		darr.deleteValue(0, 0);
		darr.traverseToArray();
		darr.deleteValue(0, 0);
		
	}
	

}

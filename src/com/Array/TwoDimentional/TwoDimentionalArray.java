package com.Array.TwoDimentional;

public class TwoDimentionalArray {
	
	int arr[][] =null;
	public TwoDimentionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int [numberOfRows][numberOfColumns];
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void insertValueinArray(int row, int col, int value) {
		try {
			if(arr[row][col]== Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("value successfully inserted"+" "+value);
			}else {
				System.out.println("This cell already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D Array");
			
		}
	}
	
	public void accessCell(int row, int col) {
		System.out.println("\nAccessing Rows"+row+" ,col#"+col);
		try {
			System.out.println("Cell value is: "+arr[row][col]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D Array");
		}
	}

}

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
	
	public void traverseToArray() {
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	public void searchingValue(int value) {
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==value) {
					System.out.println("value found at row"+i+" "+"col"+" "+j);
					return;
				}
			}
	}
			System.out.println("value not available in Array");

	}
	public void deleteValue(int row, int col) {
		try {
			System.out.println("Successfuly deleted"+arr[row][col]);
			arr[row][col] = Integer.MIN_VALUE;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("this index invalid for Array");
		}
		
	}
}
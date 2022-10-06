package com.Array.problems;

public class Snippet {
	public static int[] findPeakGrid(int[][] mat) {
	        int rows = mat.length;
	        // iterate through the rows
	        for (int i = 0; i < rows; i++) {
	            int peakColIndex = getPeakIndex(mat, i, rows);
	            if (peakColIndex != -1) {
	                return new int[] {i, peakColIndex};
	            }
	        }
	        return new int[] {-1, -1};
	    }
	
	
	    private static int getPeakIndex(int[][] mat, int rowIndex, int rows) {
	        int start = 0;
	        int end = mat[rowIndex].length - 1;
	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            int cur = mat[rowIndex][mid];
	            int leftElem;
	            int rightElem;
	            int bottomElem;
	            int topElem;
	
	            int leftIndex = mid - 1;
	            int rightIndex = mid + 1;
	            int topIndex = rowIndex - 1;
	            int bottomIndex = rowIndex + 1;
	
	            if (leftIndex < 0) {
	                leftElem = -1;
	            } else {
	                leftElem = mat[rowIndex][mid - 1];
	            }
	
	            if (rightIndex > mat[rowIndex].length - 1) {
	                rightElem = -1;
	            } else {
	                rightElem = mat[rowIndex][mid + 1];
	            }
	
	            if (topIndex < 0) {
	                topElem = -1;
	            } else {
	                topElem = mat[rowIndex - 1][mid];
	            }
	
	            if (bottomIndex >= rows) {
	                bottomElem = -1;
	            } else {
	                bottomElem = mat[rowIndex + 1][mid];
	            }
	
	            if ((cur > rightElem) && (cur > leftElem)) {
	                // mid is greater than its left and right neighbours
	
	                // if first row
	                if (rowIndex == 0) {
	                    // compare with `rowIndex+1`
	                    if (cur > bottomElem) {
	                        return mid;
	                    }
	                }
	
	                // if last row
	                if (rowIndex == (rows - 1)) {
	                    //compare with `rowIndex-1`
	                    if (cur > topElem) {
	                        return mid;
	                    }
	                }
	
	                // compare with `rowIndex+1` and `rowIndex-1`
	                if (cur > topElem && cur > bottomElem) {
	                    return mid;
	                }
	            }
	            
	          // when cur is smaller than its left or right
	            if (cur < leftElem && cur < rightElem) {
	                // see which one is bigger and shrink search space towards the bigger one
	                if (leftElem > rightElem) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            } else {
	                if (cur < rightElem) {
	                    start = mid + 1;
	                } else {
	                    end = mid - 1;
	                }
	            }
	        }
	        return -1;
	  }
	}



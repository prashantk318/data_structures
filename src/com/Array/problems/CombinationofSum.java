package com.Array.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationofSum {
	public static void main(String[] args) {
		
	}
	
	//three numbers should not be repeated
	 protected static void backtrack(int remain, int k,//totol number like 3
	            LinkedList<Integer> comb, int next_start,
	            List<List<Integer>> results) {

	        if (remain == 0 && comb.size() == k) {
	            // Note: it's important to make a deep copy here.
	            results.add(new ArrayList<Integer>(comb));
	            return;
	        } else if (remain < 0 || comb.size() == k) {
	            // Exceed the scope, no need to explore further.
	            return;
	        }
	        // Iterate through the reduced list of candidates.
	        for (int i = next_start; i < 9; ++i) {
	            comb.add(i + 1);
	            backtrack(remain - i - 1, k, comb, i + 1, results);
	            comb.removeLast();
	        }
	    }

	    public List<List<Integer>> combinationSum3(int k, int n) {
	        List<List<Integer>> results = new ArrayList<List<Integer>>();
	        LinkedList<Integer> comb = new LinkedList<Integer>();

	        this.backtrack(n, k, comb, 0, results);
	        System.out.println(results);
	        return results;
	    }
}

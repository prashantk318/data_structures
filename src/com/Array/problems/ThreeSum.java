package com.Array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class ThreeSum {
	
	public static void main(String[] args) {
		int[]nums = new int[] {1,2,-2,5,5,9};
		List<List<Integer>> lists = threeSum(nums);
		//List<Integer>list = lists.stream().flatMap(s ->s.stream()).collect(Collectors.toList());
		for(List<Integer>l:lists) {
			for(Integer m:l) {
				System.out.println(m);
			}
		}
	}
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, res);
            }
        return res;
    }
  static  void  twoSum(int[] nums, int i, List<List<Integer>> res) {
        var seen = new HashSet<Integer>();
        for (int j = i + 1; j < nums.length; ++j) {
            int complement = -nums[i] - nums[j];
            if (seen.contains(complement)) {
                res.add(Arrays.asList(nums[i], nums[j], complement));
                while (j + 1 < nums.length && nums[j] == nums[j + 1])
                    ++j;
            }
            seen.add(nums[j]);
        }
    }
}
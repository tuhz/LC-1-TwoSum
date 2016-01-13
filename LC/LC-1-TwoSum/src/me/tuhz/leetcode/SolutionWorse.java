package me.tuhz.leetcode;

public class SolutionWorse {
	
	public int[] twoSum_WorseSolution(int[] nums, int target) {
		int[] ans = new int[2];
		int length = nums.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = i + 1;
					ans[1] = j + 1;
					return ans;
				}
			}
		}
		return ans;
	}
}

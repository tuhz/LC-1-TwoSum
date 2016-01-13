package me.tuhz.leetcode;

public class Solution {

	/* This solution beats 100% of Java submissions in LCoj (runtime: 1ms) */
	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];		
		/* a large array in which the index is the value 
		   and the value is the index in nums[] */
		int[] valueIndices = new int[0xffff];
		int len = nums.length;
		for (int i = 0; i < len; ++i) {
			/* (+0xffff/2) is needed because of possible negative numbers in nums[]*/
			if (valueIndices[target - nums[i] + 0xffff / 2] != 0) {
				ans[0] = valueIndices[target - nums[i] + 0xffff / 2];
				ans[1] = i + 1;
				return ans;
			} else {
				valueIndices[nums[i] + 0xffff / 2] = i + 1;
			}
		}
		return ans;
	}
}

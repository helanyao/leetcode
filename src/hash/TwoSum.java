package hash;

import java.util.HashMap;
/**
 * Input Given nums = [2, 7, 11, 15], target = 9
 * Output return [0, 1]
 */

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two solution");
	}
}

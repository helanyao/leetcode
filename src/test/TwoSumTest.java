package test;

import static org.junit.Assert.*;

import org.junit.Test;
import hash.TwoSum;

public class TwoSumTest {

	@Test
	public void testTwoSum() {
		TwoSum test = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int[] result = {0, 1};
		assertArrayEquals(result, test.twoSum(nums, 9));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInvalid() {
		TwoSum test = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		test.twoSum(nums, 1);
	}
}

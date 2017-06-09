package test.list;

import static org.junit.Assert.*;

import org.junit.Test;

import list.ThreeSumClosest;

public class ThreeSumClosestTest {

	@Test
	public void testThreeSumClosest() {
		ThreeSumClosest threeSumCloset = new ThreeSumClosest();
		int[] nums = {-1, 2, 1, -4};
		int target = 1;
		int result = threeSumCloset.threeSumClosest(nums, target);
		assertEquals(result, 2);
	}

}

package test;

import static org.junit.Assert.*;

import list.ThreeSum;
import org.junit.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSumTest {

	@Test
	public void testThreeSum() {
		ThreeSum threeSum = new ThreeSum();
		int[] nums = {-2,0,1,1,2};
		List<List<Integer>> result = threeSum.threeSum(nums);
		List<Integer> subList1 = Arrays.asList(-2,0,2);
		List<Integer> subList2 = Arrays.asList(-2,1,1);
		List<List<Integer>> expectedResult = new ArrayList<List<Integer>>();
		expectedResult.add(subList1);
		expectedResult.add(subList2);
		System.out.println(result);
		System.out.println(expectedResult);
		
		assertEquals(expectedResult.size(), result.size());
		
		for (int i = 0; i < result.size(); i++) {
			assertTrue(result.get(i).equals(expectedResult.get(i)));
		}
	}
}

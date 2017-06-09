package test.list;

import static org.junit.Assert.*;

import org.junit.Test;

import list.ThreeSum;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSumTest {

	@Test
	public void testThreeSum1() {
		ThreeSum threeSum = new ThreeSum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = threeSum.threeSum(nums);
		List<Integer> subList1 = Arrays.asList(-1, -1, 2);
		List<Integer> subList2 = Arrays.asList(-1, 0, 1);
		List<List<Integer>> expectedResult = new ArrayList<List<Integer>>();
		expectedResult.add(subList1);
		expectedResult.add(subList2);
		System.out.println("Result: " + result);
		System.out.println("Expected: " + expectedResult);
		
		assertEquals(expectedResult.size(), result.size());
		
		for (int i = 0; i < result.size(); i++) {
			assertTrue(result.get(i).equals(expectedResult.get(i)));
		}
	}
	
	@Test
	public void testThreeSum2() {
		ThreeSum threeSum = new ThreeSum();
		int[] nums = {-2,0,1,1,2};
		List<List<Integer>> result = threeSum.threeSum(nums);
		List<Integer> subList1 = Arrays.asList(-2,0,2);
		List<Integer> subList2 = Arrays.asList(-2,1,1);
		List<List<Integer>> expectedResult = new ArrayList<List<Integer>>();
		expectedResult.add(subList1);
		expectedResult.add(subList2);
		System.out.println("Result: " + result);
		System.out.println("Expected: " + expectedResult);
		
		assertEquals(expectedResult.size(), result.size());
		
		for (int i = 0; i < result.size(); i++) {
			assertTrue(result.get(i).equals(expectedResult.get(i)));
		}
	}
	
	@Test
	public void testThreeSum3() {
		ThreeSum threeSum = new ThreeSum();
		int[] nums = {-2,0,0,2,2};
		List<List<Integer>> result = threeSum.threeSum(nums);
		List<Integer> subList1 = Arrays.asList(-2,0,2);
		List<List<Integer>> expectedResult = new ArrayList<List<Integer>>();
		expectedResult.add(subList1);
		System.out.println("Result: " + result);
		System.out.println("Expected: " + expectedResult);
		
		assertEquals(expectedResult.size(), result.size());
		
		for (int i = 0; i < result.size(); i++) {
			assertTrue(result.get(i).equals(expectedResult.get(i)));
		}
	}
}

package test.list;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import list.ListNode;
import list.TwoNumbersRegularOrder;

public class TwoNumbersRegularOrderTest {

	@Test
	public void test() {
		ListNode lheader = new ListNode(2);
		ListNode l1 = lheader;
		l1.next = new ListNode(4);
		l1 = l1.next;
		l1.next = new ListNode(3);
		
		ListNode rheader = new ListNode(5);
		ListNode l2 = rheader;
		l2.next = new ListNode(6);
		l2 = l2.next;
		l2.next = new ListNode(4);
		
		TwoNumbersRegularOrder list = new TwoNumbersRegularOrder();
		ListNode result = list.twoNumbersRegular(lheader, rheader);
		
		int sum = 0;
		int i = 0;
		ListNode header = result;
		List<Integer> expected = Arrays.asList(8, 0, 7);
		while(header != null) {
			assertEquals(expected.get(i).intValue(), header.val);
			i++;
			header = header.next;
		}
	}

}

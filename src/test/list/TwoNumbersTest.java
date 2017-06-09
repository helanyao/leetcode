package test.list;

import static org.junit.Assert.*;

import org.junit.Test;

import list.ListNode;
import list.TwoNumbersReversedOrder;

public class TwoNumbersTest {

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
		
		TwoNumbersReversedOrder twoNums = new TwoNumbersReversedOrder();
		ListNode result = twoNums.addNumbers(lheader, rheader);
		
		int sum = 0;
		int i = 1;
		ListNode header = result;
		while(header != null) {
			sum = sum + header.val * i;
			i = i * 10;
			header = header.next;
		}
		
		assertEquals(sum, 807);
	}
	
	@Test
	public void test2() {
		ListNode lheader = new ListNode(2);
		ListNode l1 = lheader;
		l1.next = new ListNode(4);
		l1 = l1.next;
		l1.next = new ListNode(7);
		
		ListNode rheader = new ListNode(5);
		ListNode l2 = rheader;
		l2.next = new ListNode(6);
		l2 = l2.next;
		l2.next = new ListNode(4);
		
		TwoNumbersReversedOrder twoNums = new TwoNumbersReversedOrder();
		ListNode result = twoNums.addNumbers(lheader, rheader);
		
		int sum = 0;
		int i = 1;
		ListNode header = result;
		while(header != null) {
			sum = sum + header.val * i;
			i = i * 10;
			header = header.next;
		}
		
		assertEquals(sum, 1207);
	}
}

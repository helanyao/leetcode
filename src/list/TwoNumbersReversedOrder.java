package list;

/**
 * https://leetcode.com/problems/add-two-numbers
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * 342+465=807
 * 
 * big number calculation
 * 
 * @author Helen
 *
 */

public class TwoNumbersReversedOrder {
	public ListNode addNumbers(ListNode l1, ListNode l2) {
		ListNode newHeader = new ListNode(0);
		int carry = 0;
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode n1 = newHeader;
		while (p1 != null || p2 != null) {
			if (p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}
			
			if (p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}
			
			n1.next = new ListNode(carry % 10);
			carry = carry / 10;
			n1 = n1.next;
		}
		
		if (carry == 1) {
			n1.next = new ListNode(1);
		}
		
		return newHeader.next;
	}
}

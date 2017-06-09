package list;

/**
 * 742+465=1207 
 * 两个单链表（singly linked list），每一个节点里面一个0-9的数字，
 * 输入就相当于两个大数了。然后返回这两个数的和（一个新list）。这两个输入的list 长度相等。 
 * 要求是：
 * 1. 不用递归。
 * 2. 要求算法在最好的情况下，只遍历两个list一次， 最差的情况下两遍。
 * 
 * not implemented
 * 
 * @author Helen
 *
 */
public class TwoNumbersRegularOrder {
	public ListNode twoNumbersRegular(ListNode l1, ListNode l2) {
		ListNode newHeader = new ListNode(0);
		ListNode pre = newHeader;
		ListNode end = newHeader;
		ListNode p1 = l1;
		ListNode p2 = l2;
		int carry = 0;
		
		while (p1 != null) {
			carry = p1.val + p2.val;
			if (carry <= 9) {
				end = new ListNode(carry);
				pre = end;
				end = end.next;
			} else {
				end = new ListNode(carry % 10);
				pre.val = pre.val + 1;
				end = end.next;
				while (pre.next != end) {
					pre = pre.next;
					pre.val = 0;
				}
			}
			p1 = p1.next;
			p2 = p2.next;
			carry = 0;
		}
		
		return newHeader.next;
	}
}

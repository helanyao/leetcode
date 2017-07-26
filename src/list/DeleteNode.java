package list;

/** O(1)֮��ɾ�����
 * 
 * @author Helen
 *
 */
public class DeleteNode {
	public void deleteNode(ListNode header, ListNode target) {
		if (header == null || target == null) return;
		
		if (target.next != null) { // ��β���
			ListNode pNext = target.next;
			target.val = pNext.val;
			target.next = pNext.next;
		} else if (header == target) { // ���������
			header = null;
		} else { // β���
			ListNode pNode = header;
			while(pNode.next != target) {
				pNode = pNode.next;
			}
			pNode.next = null;
		}
	}
	
	public static void main(String[] args) {
		DeleteNode node = new DeleteNode();
		ListNode header = new ListNode(1);
		ListNode node1 = new ListNode(1);
		header.next = node1;
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		
		node.deleteNode(header, node1);
	}
}

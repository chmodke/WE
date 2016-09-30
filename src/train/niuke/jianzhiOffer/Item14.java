/**   
 * @Title: Item14.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午9:48:53 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * @ClassName: Item14
 * @Description:输入一个链表，输出该链表中倒数第k个结点。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午9:48:53
 * 
 */
public class Item14 {
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head==null) {
			return null;
		}
		ListNode key = head;
		ListNode p = head;
		int count = 0;
		while (p != null) {
			p = p.next;
			count++;
			if (count > k) {
				key = key.next;
			}
		}
		if (count < k) {
			return null;
		}
		return key;
	}

	public void print(ListNode head) {
		ListNode p = head;
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();
	}

	@Test
	public void test() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		int key = 3;

		ListNode head = new ListNode(0);
		ListNode p = head;
		for (int t : arr) {
			p.next = new ListNode(t);
			p = p.next;
		}
		print(head);
		System.out.println(FindKthToTail(head, key).val);
	}
}

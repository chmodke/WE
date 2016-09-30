/**   
 * @Title: Item16.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月23日 上午10:31:44 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * @ClassName: Item16
 * @Description: 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月23日 上午10:31:44
 * 
 */
public class Item16 {

	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		ListNode newHead = new ListNode(0);// 新表头
		ListNode m = newHead;// 新表指针
		ListNode l = list1;// 表一指针
		ListNode k = list2;// 表二指针
		while (k != null && l != null) {
			if (k.val < l.val) {// 谁小链接谁
				m.next = k;
				k = k.next;
			} else {
				m.next = l;
				l = l.next;
			}
			m = m.next;// 指针下移
		}
		if (k == null) {
			m.next = l;// 链接后续节点
		} else {
			m.next = k;// 链接后续节点
		}
		return newHead.next;// 不返回头结点
	}
	
	
	public ListNode Merge1(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		else if (list2 == null)
			return list1;
		ListNode mergeHead = null;
		if (list1.val < list2.val) {
			mergeHead = list1;
			mergeHead.next = Merge(list1.next, list2);
		} else {
			mergeHead = list2;
			mergeHead.next = Merge(list1, list2.next);
		}
		return mergeHead;
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
		int[] arr1 = new int[] { 1, 3, 5, 7 };
		int[] arr2 = new int[] { 2, 4, 6, 8 };

		ListNode list1 = new ListNode(arr1[0]);
		ListNode list2 = new ListNode(arr2[0]);

		ListNode p = list1;
		ListNode q = list2;

		for (int t = 1; t < arr1.length; t++) {
			p.next = new ListNode(arr1[t]);
			p = p.next;
		}
		for (int t = 1; t < arr2.length; t++) {
			q.next = new ListNode(arr2[t]);
			q = q.next;
		}
		print(list1);
		print(list2);
		print(Merge(list1, list2));
	}
}

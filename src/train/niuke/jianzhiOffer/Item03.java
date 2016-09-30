/**   
 * @Title: Item03.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 上午9:50:18 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @ClassName: Item03
 * @Description: 输入一个链表，从尾到头打印链表每个节点的值。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 上午9:50:18
 * 
 */
public class Item03 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(listNode== null){
			return list;
		}
		do {
			list.add(0,listNode.val);//ArrayList头插法
			listNode = listNode.next;
		} while (listNode!= null);
		return list;
	}

	@Test
	public void testPrint() {
		ListNode head = new ListNode(0);
		ListNode p = head;
		for (int i = 1; i <= 5; i++) {
			ListNode next = new ListNode(i);
			p.next = next;
			p = p.next;
		}
		ArrayList<Integer> list= printListFromTailToHead(head);
		for(int n:list){
			System.out.print(n+" ");
		}
	}
}


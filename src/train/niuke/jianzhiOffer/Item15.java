/**   
 * @Title: Item15.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月23日 上午10:21:45 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/** 
 * @ClassName: Item15 
 * @Description: 输入一个链表，反转链表后，输出链表的所有元素。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月23日 上午10:21:45 
 *  
 */
public class Item15 {
	public ListNode ReverseList(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode newHead=null;
		ListNode p=head;
		List<Integer> list =new ArrayList<Integer>();
		while(p!=null){
			list.add(p.val);
			p=p.next;
		}
		newHead=new ListNode(list.get(list.size()-1));
		p=newHead;
		for(int i=list.size()-2;i>=0;i--){
			p.next=new ListNode(list.get(i));
			p=p.next;
		}
		return newHead;
    }

	@Test
	public void test() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

		ListNode head = ListUtil.create(arr);
		ListUtil.print(head);
		ListUtil.print(ReverseList(head));
	}
}

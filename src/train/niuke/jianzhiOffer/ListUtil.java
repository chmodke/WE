package train.niuke.jianzhiOffer;

/**
 * 链表工具类
 * Created by kehao on 2016/9/24 18:20.
 */
public class ListUtil {
    /**
     * 打印链表
     * @param head
     */
    public static void print(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    /**
     * 构造链表
     * @param arr
     * @return
     */
    public static  ListNode create(int [] arr){
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int t : arr) {
            p.next = new ListNode(t);
            p = p.next;
        }
        return head.next;
    }
}

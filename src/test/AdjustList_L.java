package test;

import datastruct.datastruct.implement.LinkedListSLNode;
import datastruct.datastruct.interfaces.Strategy;
import org.junit.Test;

/**
 * Created by kehao on 2016/10/10 18:02.
 * Description：假设一个单链表L中所有的元素为整数，设计一个算法调整该顺序表，使其中所有小于0的元素放在所有大于等于0的元素前面
 */
public class AdjustList_L {
    public static void adjust(LinkedListSLNode<Integer> head) {
        int i = 0, j = head.getSize() - 1;
        while (i < j) {
            while (head.get(i).intValue() < 0)
                i++;
            while (head.get(j).intValue() > 0)
                j--;
            if (i < j) {
                int J = head.get(j).intValue();
                int I = head.remove(i);
                head.insert(i, J);
                head.remove(j);
                head.insert(j, I);
            }
            print(head);
        }
    }

    public static void print(LinkedListSLNode list) {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }

    @Test
    public void test() {
        LinkedListSLNode<Integer> list = new LinkedListSLNode<Integer>(new Strategy<Integer>() {
            @Override
            public boolean equal(Integer o1, Integer o2) {
                return o1.intValue()==o2.intValue();
            }
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        int arr[] = {5, 7, -3, 7, 6, -1, 0, -9, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            list.insert(i, arr[i]);
        }
        print(list);
        adjust(list);
        print(list);
    }
}
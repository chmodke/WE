package test;

import org.junit.Test;

/**
 * Created by kehao on 2016/10/10 17:12.
 * Description：假设一个顺序表L中所有的元素为整数，设计一个算法调整该顺序表，使其中所有小于0的元素放在所有大于等于0的元素前面
 */
public class AdjustList {
    public static void adjust(List head) {
        int i = 0, j = head.getSize() - 1;
        while (i < j) {
            while (head.get(i) < 0)
                i++;
            while (head.get(j) > 0)
                j--;
            if (i < j) {
                /*//不封装方式
                int temp = head.get(i);
                head.arr[i] = head.get(j);
                head.arr[j] = temp;*/
                int J = head.get(j);
                int I = head.remove(head.get(i));
                head.insert(i, J);
                head.remove(head.get(j));
                head.insert(j, I);
            }
            print(head);
        }
    }

    public static void print(List list) {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }

    @Test
    public void test() {
        List list = new List();
        int arr[] = {5, 7, -3, 7, 6, -1, 0, -9, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            list.insert(i, arr[i]);
        }
        /*//数据结构测试
        list.insertBefore(5,12);
        list.insertAfter(7,13);
        print(list);
        System.out.println(list.remove(13));
        print(list);*/
        print(list);
        adjust(list);
        print(list);
    }
}

class List {
    private int arr[] = new int[30];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public int get(int index) {
        return arr[index];
    }

    public int indexOf(int aim) {
        //TODO 测试代码，未实现下标校验
        for (int i = 0; i < size; i++) {
            if (arr[i] == aim) {
                return i;
            }
        }
        return -1;
    }

    public boolean insert(int index, int data) {//before
        boolean flag = false;
        for (int i = size; i > index; i--) {
            this.arr[i] = this.arr[i - 1];
        }
        this.arr[index] = data;
        size++;
        flag = true;
        return flag;
    }

    public boolean insertBefore(int local, int data) {
        int index = indexOf(local);
        insert(index, data);
        return true;
    }

    public boolean insertAfter(int local, int data) {
        int index = indexOf(local);
        insert(index + 1, data);
        return true;
    }

    public int remove(int data) {
        int index = indexOf(data);
        int bak = get(index);
        for (int i = index; i < size - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        size--;
        return bak;
    }
}

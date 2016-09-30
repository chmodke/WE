package study.baodian.basic;

import java.util.Arrays;

/**
 * Created by kehao on 2016/9/29 12:05.
 * Description: 实现函数指针
 */
interface IntCompare {
    public int cmp(int a, int b);
}

class Cmp1 implements IntCompare {

    @Override
    public int cmp(int a, int b) {
        return a > b ? 1 : (a < b ? -1 : 0);
    }
}

class Cmp2 implements IntCompare {

    @Override
    public int cmp(int a, int b) {
        return a > b ? -1 : (a < b ? 1 : 0);
    }
}

public class Test4_1_13 {
    public static void insertSort(int[] a, IntCompare cmp) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i], j = i;
                if (cmp.cmp(a[j - 1], temp) == 1) {
                    while (j >= 1 && cmp.cmp(a[j - 1], temp) == 1) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 19, 40, 4, 7, 1};
        insertSort(arr1, new Cmp1());
        System.out.print("升序:");
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {7, 3, 19, 40, 4, 7, 1};
        insertSort(arr1, new Cmp2());
        System.out.print("降序:");
        System.out.println(Arrays.toString(arr1));
    }
}

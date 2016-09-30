package train.niuke.jianzhiOffer;

/**
 * Created by kehao on 2016/9/26 20:24.
 * Description: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */

import org.junit.Test;

/**
 * 二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）它或者是一棵空树，或者是具有下列性质的二叉树：
 * 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
 */
public class Item23 {
    /**
     * BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），
     * 如果去掉最后一个元素的序列为T，那么T满足：T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。完美的递归定义 : ) 。
     */
    /**
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length <= 0) {
            return false;
        }
        return judge(sequence, 0, sequence.length - 1);
    }

    public boolean judge(int[] a, int l, int r) {
        if (l >= r) {
            return true;
        }
        int i = r;
        while (i > l && a[i - 1] > a[r]) {//从前往后找比a[r]小的数
            --i;
        }
//        System.out.println(i);
        for (int j = i - 1; j >= l; --j) {//判断a[r]之前有没有比a[r]大的数，如果有则不成立
            if (a[j] > a[r]) {
                return false;
            }
        }
        return judge(a, l, i - 1) && judge(a, i, r - 1);
    }

    @Test
    public void test() {
        int[] post = {2, 9, 5, 16, 17, 15, 19, 18, 12};
        int[] post2 = {7, 4, 6, 5};
        System.out.println(VerifySquenceOfBST(post));
    }
}

package train.niuke.jianzhiOffer;

import java.util.Arrays;

/**
 * 树结构工具类
 * Created by kehao on 2016/9/24 18:18.
 */
public class TreeUtil {
    /**
     * 依赖先序中序序列构造二叉树
     * @param pre 先序序列
     * @param in 中序序列
     * @return
     */
    public static TreeNode createTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (pre[0] == in[i]) {
                //参考Item04
                node.left = createTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                node.right = createTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return node;
    }

    /**
     * 先序遍历树
     * @param root
     */
    public static void prePrintTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val+" ");
            prePrintTree(root.left);
            prePrintTree(root.right);
        }
    }
    /**
     * 中序遍历树
     * @param root
     */
    public static void inPrintTree(TreeNode root) {
        if (root != null) {
            inPrintTree(root.left);
            System.out.print(root.val+" ");
            inPrintTree(root.right);
        }
    }
    /**
     * 后序遍历树
     * @param root
     */
    public static void postPrintTree(TreeNode root) {
        if (root != null) {
            postPrintTree(root.left);
            postPrintTree(root.right);
            System.out.print(root.val+" ");
        }
    }
}

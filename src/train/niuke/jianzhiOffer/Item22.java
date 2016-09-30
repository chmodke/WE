package train.niuke.jianzhiOffer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kehao on 2016/9/26 19:46.
 * Description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 层序遍历树
 */
public class Item22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) return list;
        index(root, list);
        return list;
    }

    public void index(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode rt = queue.poll();
            list.add(rt.val);
            if (rt.left != null) {
                queue.add(rt.left);
            }
            if (rt.right != null) {
                queue.add(rt.right);
            }
        }
    }

    @Test
    public void test() {
        int[] pre = {1,2,4,5,3,6,7};
        int[] in = {4,2,5,1,6,3,7};
        TreeNode root = TreeUtil.createTree(pre, in);
        ArrayList<Integer> list=PrintFromTopToBottom(root);
        for (int t:list){
            System.out.print(t+"\t");
        }
    }
}

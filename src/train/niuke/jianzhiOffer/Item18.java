package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * Created by kehao on 2016/9/24 20:24.
 * Description: 操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * @author kehao
 */
public class Item18 {
    public void Mirror(TreeNode root) {
       if(root!=null){
           swap(root,root.left,root.right);
           Mirror(root.left);
           Mirror(root.right);
       }
    }

    public void swap(TreeNode root, TreeNode n1, TreeNode n2) {
        root.left=n2;
        root.right=n1;
    }

    @Test
    public void test() {
        TreeNode root = TreeUtil.createTree(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 2, 5, 1, 6, 3, 7});
        TreeUtil.prePrintTree(root);
        System.out.println();
        Mirror(root);
        TreeUtil.prePrintTree(root);
    }
}

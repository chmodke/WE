package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * ClassName: Item17
 * Description:输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 * @author kehao; kehao1158115@outlook.com
 *         date 2016年9月23日 下午10:44:02
 */
public class Item17 {
    /**
     * 思路：参考剑指offer
     * 1、首先设置标志位result = false，因为一旦匹配成功result就设为true，剩下的代码不会执行，如果匹配不成功，默认返回false
     * 2、递归思想，如果根节点相同则递归调用DoesTree1HaveTree2（），如果根节点不相同，则判断tree1的左子树和tree2是否相同，再判断右子树和tree2是否相同
     * 3、注意null的条件，HasSubTree中，如果两棵树都不为空才进行判断，DoesTree1HasTree2中，如果Tree2为空，则说明第二棵树遍历完了，即匹配成功，tree1为空有两种情况
     * （1）如果tree1为空&&tree2不为空说明不匹配，
     * （2）如果tree1为空，tree2为空，说明匹配。
     */
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = DoesTree1HaveTree2(root1, root2);
            }
            if (!result) {
                result = HasSubtree(root1.left, root2);
            }
            if (!result) {
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;
    }

    public boolean DoesTree1HaveTree2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null) {
            return false;
        }
        if (root2 == null) {
            return true;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return DoesTree1HaveTree2(root1.left, root2.left) && DoesTree1HaveTree2(root1.right, root2.right);
    }

    @Test
    public void test() {
        TreeNode root1 = TreeUtil.createTree(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 2, 5, 1, 6, 3, 7});
        TreeNode root2 = TreeUtil.createTree(new int[]{2, 4, 5}, new int[]{4, 2, 5});

        TreeUtil.postPrintTree(root1);
        System.out.println();
        TreeUtil.postPrintTree(root2);
        System.out.println();

        System.out.println(HasSubtree(root1, root2));
    }
}

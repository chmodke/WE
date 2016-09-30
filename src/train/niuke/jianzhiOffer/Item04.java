/**   
 * @Title: Item04.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 上午10:18:03 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import java.util.Arrays;

/**
 * @ClassName: Item04
 * @Description: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 上午10:18:03
 * 
 * 暂时未搞定
 * 
 */
public class Item04 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if(pre.length == 0||in.length == 0){
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++){
            if(pre[0] == in[i]){
            	/**
            	 * 在先序序列中，左子序列的第一个节点是左子树的根节点
            	 * 右子树的第一个节点是右子树的根节点
            	 * 左子树和右子树的根节点又可以分别把左子序列和右子序列分为两个子序列，
            	 * 递归直到去接序列中的元素时得到一颗二叉树
            	 */
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
            }
        }
        return node;
	}
}

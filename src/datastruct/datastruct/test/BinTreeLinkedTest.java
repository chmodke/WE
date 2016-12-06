package datastruct.datastruct.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import datastruct.datastruct.implement.BinTreeLinked;
import datastruct.datastruct.implement.BinTreeNode;
import datastruct.datastruct.interfaces.Iterator;
import datastruct.datastruct.myUtil.Log;

/**
 * @author KeHao 双向链表测试
 */
public class BinTreeLinkedTest {

	public static void main(String[] args) {
		BinTreeNode<String> root = createTree();
		BinTreeLinked<String> Strings = new BinTreeLinked<String>(root, new StringStrategy());

		System.out.println("isEmpty:" + Strings.isEmpty());
		System.out.println("size:" + Strings.getSize());
		System.out.println("height:" + Strings.getHeight());
		printList(Strings);
		System.out.print("");
	}

	public static BinTreeNode<String> createTree() {
		Scanner scan = new Scanner(System.in);
		List<BinTreeNode<String>> nodeList;
		System.out.print("输入序列长度:");
		int n = Integer.valueOf(scan.nextLine());
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("输入序列:");
			array[i] = scan.nextLine();
		}
		scan.close();
		nodeList = new LinkedList<BinTreeNode<String>>();
		// 将一个数组的值依次转换为Node节点
		for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
			nodeList.add(new BinTreeNode<String>(array[nodeIndex]));
		}
		
		// 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树
		for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
			// 左孩子
			nodeList.get(parentIndex).setLChild(nodeList.get(parentIndex * 2 + 1));
			// 右孩子
			nodeList.get(parentIndex).setRChild(nodeList.get(parentIndex * 2 + 2));
		}
		// 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理
		int lastParentIndex = array.length / 2 - 1;
		// 左孩子
		nodeList.get(lastParentIndex).setLChild(nodeList.get(lastParentIndex * 2 + 1));
		// 右孩子,如果数组的长度为奇数才建立右孩子
		if (array.length % 2 == 1) {
			nodeList.get(lastParentIndex).setRChild(nodeList.get(lastParentIndex * 2 + 2));
		}
		return nodeList.get(0);
	}

	public static void printList(BinTreeLinked<String> stus) {
		Iterator<BinTreeNode<String>> it = stus.preOrder();
		while (!it.isDone()) {
			BinTreeNode<String> s = it.currentItem();
			Log.logOut("printList:" + s.getData().toString());
			System.out.println(s.getData());
			it.next();
		}
	}
}

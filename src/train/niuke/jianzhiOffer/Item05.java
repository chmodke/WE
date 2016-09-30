/**   
 * @Title: Item05.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午4:58:15 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import java.util.Stack;

/**
 * @ClassName: Item05
 * @Description:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午4:58:15
 * 
 */
public class Item05 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		int num = 0;
		while (!stack1.isEmpty()) {
			// 将栈1数据弹出的同时压入栈2
			stack2.push(stack1.pop());
		}
		// 弹出栈2的栈顶，即就是对应的队首元素
		num = stack2.pop();
		while (!stack2.isEmpty()) {
			// 将栈2数据弹出的同时压入栈1
			stack1.push(stack2.pop());
		}
		return num;
	}
}

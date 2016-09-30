package train.niuke.jianzhiOffer;

import org.junit.Test;

import java.util.Random;
import java.util.Stack;

/**
 * Created by kehao on 2016/9/26 16:50.
 * Description:定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Item20 {
    private Stack<Integer> elem;
    private Stack<Integer> min;

    public Item20() {
        elem = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    /**
     * 将元素压入栈
     * @param node
     */
    public void push(int node) {
        elem.push(node);
        if (min.isEmpty()) {
            min.push(node);
        } else {
            if (node <= min.peek()) {
                min.push(node);
            }
        }
    }

    /**
     * 弹出栈顶元素
     */
    public void pop() {
        int top = elem.peek();
        elem.pop();
        if (top == this.min()) {
            min.pop();
        }
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public int peek(){
        return elem.peek();
    }

    /**
     * 查看当前栈中最小元素
     * @return
     */
    public int min() {
        if (min.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return min.peek();
        }
    }

    @Test
    public void test(){
        Item20 stack=new Item20();
        Random rand=new Random();
        for (int i=0;i<10;i++){
            int t=rand.nextInt(1000);
            System.out.print(t+"\t");
            stack.push(t);
        }
        System.out.println();
        for (int i=0;i<10;i++){
            System.out.print(stack.min()+"\t");
            stack.pop();
        }
    }
}

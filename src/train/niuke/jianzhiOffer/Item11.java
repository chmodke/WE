/**   
 * @Title: Item11.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午7:25:09 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * @ClassName: Item11
 * @Description: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午7:25:09
 * 
 */
public class Item11 {
	public int NumberOf1(int n) {
		return Integer.toBinaryString(n).replaceAll("0", "").length();
	}

	@Test
	public void test1() {
		System.out.println(Integer.toBinaryString(-8).replaceAll("0", "").length());
	}

	@Test
	public void test2() {
		int n = -8;
		int count = 0;
		while (n != 0) {
			count++;
			// 将n与n-1想与会把n的最右边的1去掉
			n = n & (n - 1);
		}
		System.out.println(count);
	}
}

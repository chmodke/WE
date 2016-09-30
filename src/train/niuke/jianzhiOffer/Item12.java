/**   
 * @Title: Item12.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午8:30:41 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * @ClassName: Item12
 * @Description:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午8:30:41
 * 
 */
public class Item12 {
	public double Power(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else if (exponent > 0) {
			double num = base;
			for (int i = 1; i < exponent; i++) {
				num = num * base;
			}
			return num;
		} else {
			double nums = base;
			int flag = -exponent;
			for (int i = 1; i < flag; i++) {
				nums = nums * base;
			}
			return 1 / nums;
		}
	}

	@Test
	public void test() {
		System.out.println(Power(2, -3));
	}
}

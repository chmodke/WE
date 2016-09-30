/**   
 * @Title: Item09.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午6:51:26 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * @ClassName: Item09
 * @Description:一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午6:51:26
 * 
 */
public class Item09 {
	public int JumpFloorII(int target) {
		return (int) Math.pow(2, target-1);
	}
	@Test
	public void test(){
		System.out.println(JumpFloorII(4));
	}
}

/**   
 * @Title: Item08.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午6:51:26 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * @ClassName: Item08
 * @Description:一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午6:51:26
 * 
 */
public class Item08 {
	public int JumpFloor(int target) {
		if (target == 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		if(target == 2){
			return 2;
		}
		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
	@Test
	public void test(){
		System.out.println(JumpFloor(4));
	}
}

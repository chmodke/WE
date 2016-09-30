/**   
 * @Title: Item07.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午5:51:12 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/** 
 * @ClassName: Item07 
 * @Description: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午5:51:12 
 *  
 */
public class Item07 {
	public static int Fibonacci(int n) {
		if(n==0){
			return 0;
		}
		if(n==1||n==2){
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
    }
	@Test
	public void test(){
		System.out.println(Fibonacci(39));
	}
}

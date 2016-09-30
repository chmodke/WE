/**   
 * @Title: Item10.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午7:13:58 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

/**
 * @ClassName: Item10
 * @Description: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午7:13:58
 * 
 */
public class Item10 {
	public int RectCover(int target) {
		if (target == 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		if(target == 2){
			return 2;
		}
		return RectCover(target - 1) + RectCover(target - 2);
	}
}

/**   
 * @Title: Item06.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午5:13:57 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

/**
 * @ClassName: Item06
 * @Description:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *                                                例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *                                                NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午5:13:57
 * 
 */
public class Item06 {
	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i])
				return array[i + 1];
		}
		return array[0];
	}
}

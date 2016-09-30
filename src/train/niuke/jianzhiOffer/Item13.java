/**   
 * @Title: Item13.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午8:52:23 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import java.util.Arrays;

import org.junit.Test;

/**
 * @ClassName: Item13
 * @Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 下午8:52:23
 * 
 */
public class Item13 {
	public void reOrderArray(int[] array) {
		int bak[] = new int[array.length];
		System.arraycopy(array, 0, bak, 0, array.length);
		int count = 0;
		for (int t : bak) {
			if (t % 2 == 1) {
				array[count++] = t;
			}
		}
		for (int t : bak) {
			if (t % 2 == 0) {
				array[count++] = t;
			}
		}
	}

	/*
	时间复杂度为O（n），空间复杂度为O（n）的算法
	整体思路：
	首先统计奇数的个数
	然后新建一个等长数组，设置两个指针，奇数指针从0开始，偶数指针从奇数个数的末尾开始 遍历，填数
	*/
	public void reOrderArray1(int[] array) {
		if (array.length == 0 || array.length == 1)
			return;
		int oddCount = 0, oddBegin = 0;
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 1)
				oddCount++;
		}
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 1)
				newArray[oddBegin++] = array[i];
			else
				newArray[oddCount++] = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = newArray[i];
		}
	}

	@Test
	public void test01() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		reOrderArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}

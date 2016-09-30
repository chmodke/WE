/**   
 * @Title: Solution.java 
 * @Package train.niuke.jianzhiOffer
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 上午8:28:35 
 * @version V1.0   
 */
package train.niuke.jianzhiOffer;

import org.junit.Test;

/**
 * @ClassName: Solution
 * @Description:在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月17日 上午8:28:35
 * 
 */
public class Item01 {
	public static boolean Find(int[][] array, int target) {
		int row = array.length;
		for (int i = 0; i < row; i++) {
			if (cutFind(array[i], 0, array[i].length - 1, target) >= 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @Title: cutFind 
	 * @Description: 二分查找 
	 * @param arr 
	 * @param low 
	 * @param high 
	 * @param key 
	 * @return int 
	 * @throws
	 */
	public static int cutFind(int[] arr, int low, int high, int key) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	@Test
	public void testCutFind() {
		int[] test = { 1, 2, 8, 9 };
		int num = 1;
		int result = cutFind(test, 0, test.length - 1, num);
		System.out.println(result);
	}

	@Test
	public void testFind() {
		int[][] test = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int num = 1;
		boolean result = Find(test, num);
		System.out.println(result);
	}
}

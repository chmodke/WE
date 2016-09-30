package train.saima.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int len = scanner.nextInt();
			int[] nums = new int[len];
			int[] sorts = new int[len];
			for (int i = 0; i < len; i++) {
				nums[i] = scanner.nextInt();
				sorts[i] = nums[i];
			}
			Arrays.sort(sorts);
			//找到不相等的位置
			int left = 0, right = len - 1;
			while (left < len && sorts[left] == nums[left]) {
				left++;// 左指针右移
			}
			while (right >= 0 && sorts[right] == nums[right]) {
				right--;// 右指针左移
			}
			//判断是否能一次交换
			int i;
			for (i = 0; i <= right - left; i++) {
				if (sorts[left + i] != nums[right - i]) {
					break;// 如果存在一处对应位置不相等就不能直接交换
				}
			}
			if (i > right - left) {//如果对应位置都相等，那么i比需要交换的长度大1
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
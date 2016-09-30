/**   
 * @Title: Test03.java 
 * @Package train.saima.basic
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月12日 上午9:33:31 
 * @version V1.0   
 */
package train.saima.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

/**
 * @ClassName: Test03
 * @Description: 给定一个长度为n的整数数组a，元素均不相同，问数组是否存在这样一个片段，只将该片段翻转就可以使整个数组升序排列。其中数组片段[l,r]表示序列a[l],
 *               示例： 样例输入 4 2 1 3 4 输出 输出“yes”，如果存在；否则输出“no”，不用输出引号。 样例输出 yes
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月12日 上午9:33:31
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] arr = new int[length+1];
		for (int i = 1; i <= length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int [] result=judge(arr);
		System.out.println(Arrays.toString(result));
		if(result[0]==1){
			System.out.println("yes");
		}else if(result[0]==0){
			System.out.println("no");
		}else{
			result=judge(result);
			System.out.println(Arrays.toString(result));
		}
	}

	public static int[] judge(int[] arr) {
		int flag = 0, j = 1;
		int[] list = new int[arr.length];
		for (int i = 1; i < arr.length-1 ; i++) {
			if (arr[i] > arr[i + 1]) {
				flag++;
				// if(flag>1){
				// break;
				// }
				System.out.println(i);
				list[j++] = i;
			}
		}
		if (flag == 0) {
			list[0] = 0;
			return list;
		} else if (flag == 1) {
			list[0] = 1;
			return list;
		} else {
			list[0] = 2;
			return list;
		}
	}

	@Test
	public void test() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, 1);
		list.add(1, 1);
		list.add(0, 3);
		System.out.println(list.toString());
	}
}

/**   
 * @Title: Main.java 
 * @Package com.tencent 
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月12日 上午8:37:08 
 * @version V1.0   
 */
package com.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description:
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月12日 上午8:37:08
 * 
 */
public class Item01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int j = 2; j < num; j++) {
			if (zhi(j)) {
				list.add(j);
			}
		}
		for (int k = 0; k < list.size(); k++) {
			int t1 = num - list.get(k);
			int t2 = list.indexOf(t1);
			if (t2 > 0 && list.get(k) <= list.get(t2)) {
				System.out.println(list.get(k) + ":" + list.get(t2));
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean zhi(int num) {
		if (num == 2) {// 2是例外
			return true;
		}
		if (num % 2 == 0) {// 除2以外的偶数都不是质数
			return false;
		}
		boolean flag = true;
		int sqrtn = (int) Math.sqrt(num);// 对num开根号
		for (int i = 3; i <= sqrtn; i += 2) {// num除以每个比num开根号小比1大的自然数
			if (num % i == 0) {// 如果有能被整除的，则不是质数
				flag = false;
			}
		}
		return flag;
	}
}

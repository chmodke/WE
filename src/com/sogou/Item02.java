/**   
 * @Title: Item02.java 
 * @Package com.sogou 
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月12日 下午3:40:27 
 * @version V1.0   
 */
package com.sogou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Item02
 * @Description:求输入数组中任意两个元素之间质数个数之和 数组长度2<n<10 0000 元素4<m<1000 0000
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月12日 下午3:40:27
 * 
 */
public class Item02 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		List<Integer> zhi = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		long startMem = run.totalMemory()-run.freeMemory();
		long t1=System.currentTimeMillis();
		for (int t = arr[0]; t <= arr[(arr.length - 1)]; t++) {// 计算所有质数
			if (zhi(t)) {
				zhi.add(t);
			}
		}
		System.out.println(zhi.toString());
		int sum = 0;
		for (int s = 0; s < arr.length; s++) {// 起始加数
			for (int e = s + 1; e < arr.length; e++) {// 被加数
//				System.out.println("s:" + s + " e:" + e);
				int index1 = zhi.indexOf(front(arr[s]));
				int index2 = zhi.indexOf(back(arr[e]));
//				System.out.println("sta::" + index1 + ">>" + front(arr[s]));
//				System.out.println("end::" + index2 + ">>" + back(arr[e]));
//				System.out.println((index2 - index1) + 1);
				sum += (index2 - index1) + 1;
			}
		}
		System.out.println(sum+" unit");
		long t2=System.currentTimeMillis();		
		long endMem = run.totalMemory()-run.freeMemory();
		System.out.println("use memory:" + (endMem-startMem)/1048576+"MB");
		System.out.println("use time:"+(t2-t1)/1000+"ms");
	}
	public static int front(int n) {
		for (int i = n;; i++) {
			if (zhi(i)) {
				return i;
			}
		}
	}
	public static int back(int m) {
		for (int i = m;; i--) {
			if (zhi(i)) {
				return i;
			}
		}
	}
	public static boolean zhi(int num) {
		// if (num == 2) {// 2是例外
		// return true;
		// }
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

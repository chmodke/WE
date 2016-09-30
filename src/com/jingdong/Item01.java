package com.jingdong;

import java.util.Scanner;

/**
 * Title: 题目一</br>
 * Description: </br>
 * Copyright (c) 2016 kehao Rights Reserved.</br>
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月5日 下午10:05:20
 */
public class Item01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int sum = 0;
			int num = scan.nextInt();
			for (int i = 2; i < num; i++) {
				String dec = cal(num, i);// 转换成各种进制
				String[] arr = dec.split(" ");
				for (int j = 0; j < arr.length; j++) {
					sum += Integer.valueOf(arr[j]);
				}
			}
			int temp = 1;
			int gcd = 1;
			do {
				temp = gcd(sum / gcd, (num - 2) / gcd);
				gcd = gcd * temp;// 求约数
			} while (temp > 1);
			System.out.println((sum / gcd) + "/" + ((num - 2) / gcd));
		}
	}
	
	/**
	 * Title: 进制转换</br>
	 * Description: </br>
	 * Copyright (c) 2016 kehao Rights Reserved.</br>
	 * @author kehao; kehao1158115@outlook.com
	 * @date 2016年9月5日 下午10:05:07
	 */
	public static String cal(int num, int n) {
		StringBuilder sb = new StringBuilder();
		while (num >= n) {
			sb.append(num % n);
			num = num / n;
			sb.append(" ");
		}
		sb.append(num);
		String temp = sb.reverse().toString();
		return temp;
	}

	/**
	 * Title: 求最大公约数</br>
	 * Description: </br>
	 * Copyright (c) 2016 kehao Rights Reserved.</br>
	 * 
	 * @author kehao; kehao1158115@outlook.com
	 * @date 2016年9月5日 下午10:04:53
	 */
	public static int gcd(int m, int n) {
		int a = Math.max(m, n);
		int b = Math.min(m, n);
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
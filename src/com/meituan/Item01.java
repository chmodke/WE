package com.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Item01
 * @Description: 输入一个数组，判断每一个元素右边有多少个元素比它大
 * 实例：1 2 3 4 5 6
 * 		5 4 3 2 1 0
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月12日 上午9:20:30
 * 
 */
public class Item01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>();
		//不使用结束标记输入数组
		String[] arr = (scan.nextLine()).split(" ");
		scan.close();
		for (String str : arr) {
			nums.add(Integer.valueOf(str));
		}
		//不使用结束标记输入数组
		List<Integer> count = new ArrayList<Integer>();
		for (int j = 0; j < nums.size(); j++) {
			int t = 0;
			for (int i = j + 1; i < nums.size(); i++) {
				if (nums.get(j) < nums.get(i)) {
					t++;
				}
			}
			count.add(t);
		}
		for (Integer i : count) {
			System.out.print(i.intValue() + " ");
		}
	}
}
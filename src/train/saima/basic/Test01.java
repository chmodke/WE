package train.saima.basic;

import java.util.Scanner;

/**
 * Title: 赛码基础练习一</br>
 * Description: 股神：小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化：
 * 第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天...依此类推。
 * 为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？</br>
 * Copyright (c) 2016 kehao Rights Reserved.</br>
 * 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月9日 下午4:27:33
 */

public class Test01 {
	/**
	 * Title: </br>
	 * Description: 根据累加和结果数n计算累加值</br>
	 * Copyright (c) 2016 kehao Rights Reserved.</br>
	 * 
	 * @author kehao; kehao1158115@outlook.com
	 * @date 2016年9月9日 下午4:31:25
	 */
	public static int cal_n(int n) {
		double temp = ((Math.pow((1 + 8 * n), 0.5)) * 0.5) - 0.5;
		return (int) Math.floor(temp);
	}

	public static int cal_sum(int n) {
		return (int) (((n + 1) * n) * 0.5);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		scan.close();
		int n = cal_n(temp);// 涨跌周期数
		int sum = cal_sum(n - 2);// 涨跌结果和
		sum = (sum + 1) + (temp - cal_sum(n));// 本利和
		System.out.println(sum);
	}
}

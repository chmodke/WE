package train.saima.basic;

import java.util.Scanner;

/**
 * Title: 赛码基础练习二</br>
 * Description: 这个数字的十进制范围是l~r，且这个数的二进制表示中恰有m个1，却不记得确切的数字了。
 * 他想要让小赛算出，他最坏情况下，要试多少次密码才能确保打开手机呢？ 请输出这个次数。</br>
 * Copyright (c) 2016 kehao Rights Reserved.</br>
 * 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月9日 下午5:21:20
 */

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l=scan.nextInt();
		int r=scan.nextInt();
		int m=scan.nextInt();
		scan.close();
		int count_m=0;
		int count_c=0;
		for(int i=l;i<=r;i++){
			String[] arr=(cal(i,2)).split(" ");
			count_m=0;
			for(String str:arr){
				if(str.equals("1")){
					count_m++;
				}
			}
			if(count_m==m){
				count_c++;
			}
		}
		System.out.println((count_c==0?"-1":count_c));
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
}

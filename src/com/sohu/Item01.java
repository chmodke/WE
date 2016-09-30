/**   
 * @Title: Item01.java 
 * @Package com.sohu 
 * @Description: 
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月21日 下午4:23:12 
 * @version V1.0   
 */
package com.sohu;

import java.util.Scanner;

/**
 * @ClassName: Item01
 * @Description:
 * @author kehao; kehao1158115@outlook.com
 * @date 2016年9月21日 下午4:23:12
 * 
 */
public class Item01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true){
			String num = scan.nextLine();
			int n = scan.nextInt();
			System.out.println(max(num, n));
		}
	}

	public static String max(String num, int n) {
		StringBuffer temp = new StringBuffer(num);
		for (int i = 0; i < n; i++) {
			for(int j=0;j<temp.length()-1;j++){
				if(temp.charAt(j)<temp.charAt(j+1)){
					temp.replace(j, j+1, "");
					break;
				}
			}
		}
		return temp.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String max1(String num, int n) {
		String temp = num;
		for (int i = 0; i < n; i++) {
			if (temp.indexOf("0") >= 0) {
				temp = temp.replaceFirst("0", "");
			} else if (temp.indexOf("1") >= 0) {
				temp = temp.replaceFirst("1", "");
			} else if (temp.indexOf("2") >= 0) {
				temp = temp.replaceFirst("2", "");
			} else if (temp.indexOf("3") >= 0) {
				temp = temp.replaceFirst("3", "");
			} else if (temp.indexOf("4") >= 0) {
				temp = temp.replaceFirst("4", "");
			} else if (temp.indexOf("5") >= 0) {
				temp = temp.replaceFirst("5", "");
			} else if (temp.indexOf("6") >= 0) {
				temp = temp.replaceFirst("6", "");
			} else if (temp.indexOf("7") >= 0) {
				temp = temp.replaceFirst("7", "");
			} else if (temp.indexOf("8") >= 0) {
				temp = temp.replaceFirst("8", "");
			} else {
				temp = temp.replaceFirst("9", "");
			}
		}
		return temp;
	}
}

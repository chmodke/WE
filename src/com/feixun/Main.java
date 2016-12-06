package com.feixun;

/**
 * Created by kehao on 2016/10/8 21:53.
 * Description：输出指定年的每一天
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean run = runNian(year);
        printDate(run);
    }

    public static boolean runNian(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printDate(boolean run) {
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for (int j = 1; j <= 31; j++) {
                        System.out.println(i + "月" + j + "日");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    for (int j = 1; j <= 30; j++) {
                        System.out.println(i + "月" + j + "日");
                    }
                    break;
                case 2:
                    if (run) {
                        for (int j = 1; j <= 29; j++) {
                            System.out.println(i + "月" + j + "日");
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            System.out.println(i + "月" + j + "日");
                        }
                    }
                    break;
            }
        }
    }
}
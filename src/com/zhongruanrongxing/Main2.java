package com.zhongruanrongxing;

import java.util.Scanner;

/**
 * Created by kehao on 2016/10/6 19:02.
 * Description：
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        String t[] = temp.split(",");
        int arr[] = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            arr[i] = Integer.valueOf(t[i]);
        }
//        for (int a:arr){
//            System.out.print(a+"\t");
//        }
//        System.out.println();
        sort(arr);
//        for (int a:arr){
//            System.out.print(a+"\t");
//        }
//        System.out.println();
        remove(arr);
//        for (int a:arr){
//            System.out.print(a+"\t");
//        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
//        System.out.println();
        System.out.println(sum);
    }

    public static void remove(int[] arr) {
        int minT = arr[0];
        int maxT = arr[arr.length - 1];
        for (int i = 1, j = arr.length - 2; i < arr.length; i++, j--) {
            if (arr[i] == minT) {
                arr[i] = 0;
            }
            if (arr[j] == maxT) {
                arr[j] = 0;
            }
        }
        arr[arr.length - 1] = arr[0] = 0;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

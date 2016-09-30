package com.zhongruanrongxing;


import java.io.*;

/**
 * Created by kehao on 2016/10/6 18:24.
 * Description：
 */
public class Main1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        String temp= null;
        try {
            temp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        temp=temp.replaceAll(" \'","");
        temp=temp.replaceAll("\' ","");
        temp=temp.replaceAll("\'","");
        String arr[]=temp.split(",");
        char[] arrc=new char[arr.length];
        for (int i=0;i<arr.length;i++){
            arrc[i]=arr[i].toCharArray()[0];
        }
        sort(arrc);
        for (int i=0;i<arrc.length;i++){
            System.out.print("\'"+arrc[i]+"\'");
            if(i!=(arr.length-1)){
                System.out.print(" , ");
            }
        }
    }

    public static void sort(char []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

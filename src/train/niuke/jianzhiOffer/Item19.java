package train.niuke.jianzhiOffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by kehao on 2016/9/24 21:46.
 * Description:输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 此算法不符合要求，只解决了方阵，不能处理普通矩阵
 */
public class Item19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (matrix.length % 2 == 0) {
            for (int n = 0; n < matrix.length / 2; n++) {
                index(matrix, n, list);
            }
        } else {
            for (int n = 0; n < matrix.length / 2 + 1; n++) {
                index(matrix, n, list);
            }
        }
        return list;
    }

    /**
     * 遍历第n层
     *
     * @param matrix
     * @param n
     * @param list
     */
    public void index(int[][] matrix, int n, ArrayList<Integer> list) {
        for (int i = n; i < (matrix.length - n); i++) {//上行
            //第n行
            list.add(matrix[n][i]);
        }
        for (int i = n + 1; i < (matrix[n].length - n); i++) {//右列
            //第matrix[n].length - n-1列
            list.add(matrix[i][matrix[n].length - n - 1]);
        }
        for (int i = matrix.length - n - 2; i >= n; i--) {//下行
            //第matrix[n].length - n行
            list.add(matrix[matrix[n].length - n - 1][i]);
        }
        for (int i = matrix.length - n - 2; i > n; i--) {//左列
            //第n列
            list.add(matrix[i][n]);
        }
    }

    /**
     * 数组转为矩阵
     *
     * @param arr
     * @return
     */
    public int[][] tran(int arr[]) {
        int row = (int) Math.sqrt(arr.length);
        int[][] matrix = new int[row][row];
        int t = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = arr[t++];
            }
        }
        return matrix;
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17,18,19,20,21,22,23,24,25};
        int[][] matrix = tran(arr);
        ArrayList<Integer> list = printMatrix(matrix);
        for (int t : list) {
            System.out.print(t + "\t");
        }
    }
}

package train.niuke.jianzhiOffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by kehao on 2016/9/25 10:33.
 * Description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 所有矩阵均可以
 */
public class Item19_1 {
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
        for (int i = n; i < (matrix[n].length - n); i++) {//上行,控制列
            //第n行
            if (list.size() >= matrix[n].length * matrix.length) {
                break;
            }
            list.add(matrix[n][i]);
        }
        for (int i = n + 1; i < (matrix.length - n); i++) {//右列,控制行
            //第matrix[n].length - n - 1列
            if (list.size() >= matrix[n].length * matrix.length) {
                break;
            }
            list.add(matrix[i][matrix[n].length - n - 1]);
        }

        for (int i = matrix[n].length - n - 2; i >= n; i--) {//下行,控制列
            //第matrix.length - n - 1行
            if (list.size() >= matrix[n].length * matrix.length) {
                break;
            }
            list.add(matrix[matrix.length - n - 1][i]);
        }
        for (int i = matrix.length - n - 2; i > n; i--) {//左列,控制行
            //第n列
            if (list.size() >= matrix[n].length * matrix.length) {
                break;
            }
            list.add(matrix[i][n]);
        }
    }

    @Test
    public void test() {
        int[][] matrix1 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};//偶数方阵
        int[][] matrix2 = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};//奇数方阵

        int[][] matrix3 = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};//3*5矩阵
        int[][] matrix4 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};//5*3矩阵

        int[][] matrix5 = new int[][]{{1}, {2}, {3}, {4}, {5}};//5*1矩阵

        int[][] matrix6 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};//4*3矩阵
        int[][] matrix7 = new int[][]{{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}, {16, 17, 18}};//3*6矩阵

        int[][] matrix8 = new int[][]{};//空矩阵

        ArrayList<Integer> list = printMatrix(matrix8);
        for (int t : list) {
            System.out.print(t + "\t");
        }
    }
}

package train.saima.basic;

import java.util.Scanner;

public class Test01_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer n = null;
		while ((n = in.nextInt()) != null) {
			int price = 1;
			int i = 2;
			int j = 3;
			for (int m = 1; m < n; m++) {
				if (m == i) {
					price--;
					i = i + j;
					j++;
				} else {
					price++;
				}
			}
			System.out.println(price);
		}
	}
}
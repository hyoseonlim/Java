package lecture03;

import java.util.Scanner;

public class W3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2차원 배열 크기 입력 >> ");
		int n = scanner.nextInt();
		System.out.printf("%dX%d 배열 생성\n", n, n);

		/*
		 * ✅ 중첩 for문 for (int i = 0; i < num; i++) { for (int j = 0; j < num; j++) {
		 * System.out.print((int) (Math.random() * 256)); System.out.print(" "); }
		 * System.out.println(); }
		 */

		// ✅ 2차원 배열
		int[][] array = new int[n][n];
//		for (int i = 0; i < array.length; i++)
//			for (int j = 0; j < array[i].length; j++)
//				array[i][j] = (int) (Math.random() * 256);
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + "\t");
//			}
//
//			System.out.println();
//		}

		for (int[] row : array) {
			for (int x : row) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}

		scanner.close();
	}
}

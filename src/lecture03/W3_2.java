package lecture03;

import java.util.Scanner;

public class W3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("양의 정수 입력 >> ");
			num = scanner.nextInt();
			if (num <= 0) {
				break;
			}
			for (int i = 0; i < num; i++) {
				for (int j = num - i; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}

package hw03;

import java.util.Scanner;

public class Ch3_10 {
	public static void main(String[] args) {
		System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
		int numbers[][] = new int[4][4];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = (int) (Math.random() * 256);
				System.out.printf("%-4d", numbers[i][j]);
			}
			System.out.println();
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("임계값 입력>>");
		int threshold = scanner.nextInt();
		scanner.close();
		for (int row[] : numbers) {
			for (int num : row) {
				num = (num > threshold) ? 255 : 0;
				System.out.printf("%-4d", num);
			}
			System.out.println();
		}

	}
}

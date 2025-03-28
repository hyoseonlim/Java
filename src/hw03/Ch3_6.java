package hw03;

import java.util.Scanner;

public class Ch3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[10];
		System.out.print("양의 정수 10개 입력>>");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.print("자리수의 합이 9인 것은 ...");

		for (int number : numbers) {
			int sum = 0;
			int temp = number;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum == 9)
				System.out.print(number + " ");
		}

		scanner.close();
	}

}

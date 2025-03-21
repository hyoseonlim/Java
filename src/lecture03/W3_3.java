package lecture03;

import java.util.Scanner;

// 조회 시 int n : numbers 활용
// 수정 시에는 n으로 하는 것이 아닌 numbers[i]로 해야 적용됨
public class W3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 10개 입력 >> ");
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int n : numbers) {
			if (n % 3 == 0) {
				System.out.print(n);
				System.out.print(" ");
			}
		}
		scanner.close();
	}
}

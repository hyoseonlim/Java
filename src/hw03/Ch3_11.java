package hw03;

import java.util.Scanner;

public class Ch3_11 {
	public static void main(String[] args) {
		System.out.println("***** 구구단을 맞히는 퀴즈입니다. *****");
		int wrong = 0;
		int n1, n2 = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n1 = (int) (Math.random() * 9) + 1;
			n2 = (int) (Math.random() * 9) + 1;
			System.out.printf("%dx%d=", n1, n2);
			if (scanner.nextInt() != n1 * n2) {
				wrong++;
				System.out.printf(" %d번 틀렸습니다.", wrong);
				if (wrong >= 3) {
					System.out.println(" 퀴즈 종료합니다.");
					break;
				} else
					System.out.println("분발하세요.");
			} else {
				System.out.println("정답입니다. 잘했습니다.");
			}

		}
		scanner.close();
	}
}

package hw03;

import java.util.Scanner;

public class Ch3_14 {
	public static void main(String[] args) {
		System.out.println("***** 갬블링 게임을 시작합니다. *****");
		int n1, n2, n3;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("엔터키 입력>>");
			scanner.nextLine(); // enter 키 대기
			n1 = (int) (Math.random() * 3);
			n2 = (int) (Math.random() * 3);
			n3 = (int) (Math.random() * 3);
			System.out.printf("%d %d %d\n", n1, n2, n3);
			if (n1 == n2 && n2 == n3) {
				System.out.print("성공! 대박났어요!\n계속하시겠습니까?(yes/no)>>");
				if (scanner.nextLine().equals("no"))
					break;
			}

		}
		scanner.close();
	}
}

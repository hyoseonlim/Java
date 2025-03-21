package lecture03;

import java.util.Scanner;

public class W3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요. -1은 입력 끝 >> ");
		int sum = 0, count = 0;
		while (true) {
			String target = scanner.next();
			if (target.equals("-1")) {
				break;
			}
			try {
				int num = Integer.parseInt(target);
				if (num > 0) {
					sum += Integer.parseInt(target);
					count++;
				} else {
					System.out.println(target + " 제외");
				}
			} catch (NumberFormatException e) {
				System.out.println(target + " 제외");
			}
		}
		System.out.println("평균은 " + sum / count);
		scanner.close();
	}
}

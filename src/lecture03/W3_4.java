package lecture03;

import java.util.Scanner;

public class W3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2차원 배열 크기 입력 >> ");
		int num = scanner.nextInt();
		System.out.printf("%dX%d 배열 생성\n", num, num);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print((int) (Math.random() * 256));
				System.out.print(" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
/*
 * 정수 나누기 0: ArithmeticException null 레퍼런스 참조: NullPointerException 타입 변환 불가:
 * ClassCastException 메모리 부족: OutOfMemoryError 배열의 범위를 벗어난 접근:
 * ArrayIndexOutOfBoundsException 잘못된 인자 전달 시: IllegalArgumentException 입출력 동작
 * 실패 또는 인터럽트 시: IOException 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자 변환 시:
 * NumberFormatException Scanner의 nextInt() 호출했으나 정수 아니면: InputMismatchException
 */

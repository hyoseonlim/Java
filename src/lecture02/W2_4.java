package lecture02;

import java.util.Scanner;

public class W2_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산 입력 >> ");
	double num1 = scanner.nextDouble();
	String method = scanner.next();
	double num2 = scanner.nextDouble();
	
	switch(method) {
		case "더하기":
			System.out.println(num1 + " 더하기 " + num2 + "의 계산 결과는 " + (num1 + num2));
			break;
		case "빼기":
			System.out.println(num1 + " 빼기 " + num2 + "의 계산 결과는 " + (num1 - num2));
			break;
		case "곱하기":
			System.out.println(num1 + " 곱하기 " + num2 + "의 계산 결과는 " + (num1 * num2));
			break;
		case "나누기":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			System.out.println(num1 + " 나누기 " + num2 + "의 계산 결과는 " + (num1 / num2));
		break;
		default:
			System.out.println("사칙연산이 아닙니다");
			
	}
	scanner.close();
	}
}

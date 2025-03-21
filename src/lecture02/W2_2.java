package lecture02;
import java.util.Scanner;

public class W2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("생일 입력 하세요 >> ");
		int birth = scanner.nextInt();
		int day = birth % 100;
		int month = (birth / 100) % 100;
		int year = birth / 10000;
		System.out.println(year + "년 "+ month +  "월 " + day+ "일");
		scanner.close();
	}

}

package lecture03;

public class W3_1 {
	public static void main(String[] args) {
		int sum = 0, i = 1;

		// for
		for (sum = 0, i = 1; i <= 50; i += 3) {
			sum += i;
		}
		System.out.println(sum);

		// do-while
		sum = 0;
		i = 1;
		do {
			sum += i;
			i += 3;
		} while (i <= 50);
		System.out.println(sum);
	}
}

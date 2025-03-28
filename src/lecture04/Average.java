package lecture04;

public class Average {
	int numbers[] = new int[10];
	int count = 0;

	void put(int num) {
		numbers[count] = num;
		count++;
	}
	
	void showAll() {
		for(int i=0; i<count; i++) {
			System.out.print(numbers[i] + " ");;
		}
		System.out.println();
	}
	
	double getAvg() {
		int sum = 0;
		for(int i=0; i<count; i++) {
			sum += numbers[i];
		}
		return (double)sum/count;
	}

	public static void main(String[] args) {
		Average avg = new Average();
		avg.put(10);   // 10 저장
		avg.put(15);   // 15 저장
		avg.put(100); // 100 저장
		avg.showAll();  // 저장된 모든 원소 출력
		System.out.println("평균은 " + avg.getAvg());  // 평균 출력
	}

}

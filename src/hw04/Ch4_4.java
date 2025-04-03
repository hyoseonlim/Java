package hw04;

class Average {
	int numbers[] = new int[10];
	int count = 0;
	
	void put(int number) {
		numbers[count] = number;
		count++;
	}
	
	int pop() {
		int last = numbers[count];
		numbers[count] = 0;
		count--;
		return last;
	}
	
	int length() {
		return count;
	}
	
	void showAll() {
		for(int i=0; i<count; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	double getAvg() {
		int sum = 0;
		for(int i=0; i<count; i++) {
			sum += numbers[i];
		}
		return sum / count;
	}
}

public class Ch4_4 {

	public static void main(String[] args) {
		Average avg = new Average();
		avg.put(10);   // 10 저장
		avg.put(15);   // 15 저장
		avg.pop();      // 마지막으로 저장된 원소를 제거
		avg.put(100); // 100 저장
		avg.showAll();  // 저장된 모든 원소 출력 -> 10 저장, 15 저장, 15 제거, 100 제거 이므로 10, 100을 출력
		System.out.println("평균은 " + avg.getAvg());  // 평균 출력

		System.out.println("마지막 원소는 " + avg.pop()); 
		avg.showAll();  //  10, 100 에서 마지막을 제거 했으므로 10을 출력
	}

}

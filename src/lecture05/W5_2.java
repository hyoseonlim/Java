package lecture05;

class IntList {
	int numbers[];
	int count = 0;
	
	public IntList() {
		numbers = new int[4];
	}
	
	public IntList(int n) {
		numbers = new int[n];
	}
	
	void put(int value) {
		numbers[count] = value;
		if(count < numbers.length -1) count++;
	}
	
	void show() {
		for(int n: numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	double getAverage() {
		double sum = 0; // int 끼리 나누면 몫 int 됨
		for(int n:numbers) sum += n;
		return sum / numbers.length;
	}
}

public class W5_2 {

	public static void main(String[] args) {
		IntList list1 = new IntList();
		list1.put(10);
		list1.put(20);
		list1.put(30);
		list1.put(40);
		list1.put(50);
		System.out.println("평균은 " + list1.getAverage());
		
		IntList list2 = new IntList(5);
		list2.put(10);
		list2.put(20);
		list2.put(30);
		list2.put(40);
		list2.put(50);
		System.out.println("평균은 " + list2.getAverage());		

	}

}

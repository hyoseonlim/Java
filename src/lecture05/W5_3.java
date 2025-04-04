package lecture05;

class IntVarList {
	int[] numbers;	
	int count = 0;
	
	public IntVarList(int[] values) {
		numbers = new int[values.length * 2];
		for(int value:values) {
			numbers[count] = value;
			count++;
		}
	}
	
	 void put(int value) {
		numbers[count] = value;
		if(count < numbers.length -1) count++;
		if(count == numbers.length -1) addStorage();
	}
	 
	 void addStorage() {
		 int temps[] = numbers;
		 this.numbers = new int[numbers.length * 2];
		 int cnt = 0;
		 for(int temp:temps) {
			 numbers[cnt] = temp;
			 cnt++;
		 }
	 }
	 
	int pop(){
		int last = numbers[count];
		numbers[count] = 0;
		count--;
		return last;
	}
	
	void show() {
		for(int n: numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

public class W5_3 {
	public static void main(String[] args) {
		int[] initial_values = { 1, 2 };
		IntVarList intVarList = new IntVarList(initial_values);
		intVarList.put(3);
		intVarList.put(4);
		intVarList.put(5);
		intVarList.show();  // 1 2 3 4 5 출력
	}
}

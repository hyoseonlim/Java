package lecture05;

class IntVarList {
	int[] values;
	int index;
	
	IntVarList() {
		values = new int[4];
		index = 0;
	}
	
	IntVarList(int n) {
		values = new int[n];
		index = 0;
	}

	IntVarList(int[] initial_values) {
		values = new int[initial_values.length * 2];
		for (int value : initial_values) 
			put(value);
	}


	void put(int x) {
		if (index == values.length) {
			int[] temp = new int[values.length * 2];
			for (int i = 0; i < index; i++)
				temp[i] = values[i];
			values = temp;
		}

		values[index] = x;
		index++;
	}
	
	void show() {
		for (int i = 0; i < index; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		
	}
	
	double getAverage() {
		
		double sum = 0;
		for (int i = 0; i < index; i++) {
			sum += values[i];
		}
		return sum / index;
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

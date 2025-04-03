package hw04;

class TV {
	String company;
	int size;
	int price;
	
	void increasePrice(int increase) {
		price += increase;
	}
	
	void decreasePrice(int decrease) {
		price -= decrease;
	}
	
	void show() {
		System.out.printf("%s에서 만든 %d만원짜리의 %d인치 TV\n", company, price, size);
	}
}

public class Ch4_1 {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.company = "Samsung";
		tv.size = 50;
		tv.price = 300;
		tv.show();
		tv.increasePrice(50);
		tv.show();
		tv.decreasePrice(50);
		tv.show();

	}

}

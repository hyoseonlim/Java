package lecture05;

class TV {
	String company;
	int price;
	int size;
	
	public TV() {
		this.company = "Unknown";
		this.price = 100;
		this.size = 24;
	}
	
	public TV(String company, int price, int size) {
		this.company = company;
		this.price = price;
		this.size = size;
	}
	
	void show() {
		System.out.printf("%s에서 만든 %d만원짜리의 %d인치 TV\n", company, price, size);
	}
}

public class W5_1 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.show();
		TV tv2 = new TV("Samsung", 300, 50);
		tv2.show();
	}

}

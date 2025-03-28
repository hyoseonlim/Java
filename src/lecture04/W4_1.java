package lecture04;

class TV {
	String company;
	int size;
	int price;
	
	void show() {
		System.out.printf("%s에서 만든 %d만원짜리의 %d인치 TV", company, price, size);
	}
}

public class W4_1 {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.company = "Samsung";
		tv.size = 50;
		tv.price = 300;
		tv.show();
	}

}

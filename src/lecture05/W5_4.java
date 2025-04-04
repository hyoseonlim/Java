package lecture05;

class Monitor {
	String company;
	int price;
	int size;
	
	public Monitor(){
		this.company = "Unknown";
		this.price = 100;
		this.size = 24;
	}
	
	public Monitor(String company){
		this.company = company;
		this.price = 100;
		this.size = 24;
	}
	
	public Monitor(String company, int price, int size) {
		this.company = company;
		this.price = price;
		this.size = size;
	}
	
	void show() {
		System.out.printf("%s에서 만든 %d만원짜리의 %d인치 Monitor\n", company, price, size);
	}
}

public class W5_4 {

	public static void main(String[] args){
		Monitor m1 = new Monitor();
		m1.show();
		Monitor m2 = new Monitor("Samsung");
		m2.show();
		Monitor m3 = new Monitor("Samsung", 300, 50);
		m3.show();
		}

}

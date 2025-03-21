package lecture02;

public class W2_3 {

	public static void main(String[] args) {
		byte status1 = (byte) 0b10100011;
		byte status2 = (byte) 0b01001010;
		byte mask = (byte) 0b00011100;
		System.out.println("기기 상태: " + ((status1 & mask) == 0));
		System.out.println("기기 상태: " + ((status2 & mask) == 0));
	}

}

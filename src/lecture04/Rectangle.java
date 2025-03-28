package lecture04;

import java.util.Scanner;

public class Rectangle {
	
	int width, length, area;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
		this.area = width * length;
	}
	
	int getWidth() {
		return this.width;
	}
	
	int getLength() {
		return this.length;
	}
	
	int getArea() {
		return this.area;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("사각형 개수>>");
		int count = scanner.nextInt();
		int max = 0;
		Rectangle rectangles[] = new Rectangle[count];
		
		for(int i=0; i<count; i++) {
			System.out.printf("사각형 %d의 가로, 세로>>", i+1);
			rectangles[i] = new Rectangle(scanner.nextInt(), scanner.nextInt());
			if(i>0) {
				if(rectangles[max].getArea() < rectangles[i].getArea()) max = i;
			}
		}
		System.out.printf("가장 큰 사각형은 %d, %d이고 넓이는 %d입니다.", rectangles[max].getWidth(), rectangles[max].getLength(), rectangles[max].getArea());
		scanner.close();
	}

}

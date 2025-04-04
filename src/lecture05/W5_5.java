package lecture05;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	int area;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
	}
	
	boolean isSquare() {
		return this.width == this.height;
	}
}

public class W5_5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사각형 개수>> ");
		int size = scanner.nextInt();
		Rectangle rectangles[] = new Rectangle[size];
		
		for(int i=0; i<size; i++) {
			System.out.printf("사각형 %d의 가로, 세로>> ", i+1);
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			rectangles[i] = new Rectangle(width, height);
		}
		scanner.close();
		showMax(rectangles);
	}
	
	//  왜 static이 아니면 오류?
	private static void showMax(Rectangle rectangles[]) {
		int maxIndex = 0;
		int maxArea = 0;
		for(int i=0; i<rectangles.length; i++) {
			if(rectangles[i].isSquare()) {
				if(maxArea < rectangles[i].area) {
					maxArea = rectangles[i].area;
					maxIndex = i;
				}
			}
		}
		Rectangle max = rectangles[maxIndex];
		System.out.printf("가장 큰 정사각형은 %d, %d이고 넓이는 %d입니다.", max.width, max.height, max.area);
	}
}

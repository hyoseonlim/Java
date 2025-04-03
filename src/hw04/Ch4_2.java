package hw04;

class Cube{
	
	int width;
	int depth;
	int height;
	
	int getVolume() {
		return width * depth * height;
	}
	
	void increase(int increaseWidth, int increaseDepth, int increaseHeight) {
		width += increaseWidth;
		depth += increaseDepth;
		height += increaseHeight;
	}
	
	boolean isZero() {
		return this.getVolume() == 0;
	}
	
	boolean isSquare() {
		return (width == depth && depth == height);
	}
}

public class Ch4_2 {

	public static void main(String[] args) {
		Cube cube = new Cube();   
		cube.width = 1;   // 가로, 세로, 높이가 1, 2, 3인 큐브
		cube.depth = 2;
		cube.height = 3;
		System.out.println("큐브의 부피는 " + cube.getVolume());
		cube.increase(3, 2, 1);    // 가로, 세로, 높이를 각각 3, 2, 1 씩 증가
		System.out.println("큐브의 부피는 " + cube.getVolume());
		if (cube.isZero())
			System.out.println("큐브의 부피는 0");
		else
			System.out.println("큐브의 부피는 0이 아님");
		if (cube.isSquare())
			System.out.println("큐브는 정육면체");
		else
			System.out.println("큐브는 정육면체가 아님");
	}

}

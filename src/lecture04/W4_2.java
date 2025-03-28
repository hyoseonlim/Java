package lecture04;

class Cube {
	int width, depth, height;
	
	int getVolume() {
		return width * depth * height;
	}
	
	void increase (int addWidth, int addDepth, int addHeight) {
		width += addWidth;
		depth += addDepth;
		height += addHeight;
	}
	
	boolean isZero() {
		return getVolume() == 0;
	}
}

public class W4_2 {

	public static void main(String[] args) {
		Cube cube = new Cube();   
		// 가로, 세로, 높이가 1, 2, 3인 큐브
		cube.width = 1;
		cube.depth = 2;
		cube.height = 3;
		System.out.println("큐브의 부피는 " + cube.getVolume());
		cube.increase(1, 2, 3);    // 가로, 세로, 높이를 각각 1, 2, 3 씩 증가
		System.out.println("큐브의 부피는 " + cube.getVolume());
		if (cube.isZero())
		System.out.println("큐브의 부피는 0");
		else
		System.out.println("큐브의 부피는 0이 아님");

	}

}

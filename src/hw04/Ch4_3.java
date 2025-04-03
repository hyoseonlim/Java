package hw04;

class Grade {
	String name;
	int java;
	int web;
	int os;
	
	String getName() {
		return this.name;
	}
	
	int getAverage() {
		return (java + web + os) / 3;
	}
	
	int getMax() {
		if(java > web && java > os) return java;
		else if(web > os) return web;
		else return os;
	}
	
	int getMin() {
		if(java < web && java < os) return java;
		else if(web < os) return web;
		else return os;
	}
	
}

public class Ch4_3 {

	public static void main(String[] args) {
		Grade grade = new Grade();
		grade.name = "Kevin";
		grade.java = 100;
		grade.os = 80;
		grade.web = 90;

		System.out.println(grade.name + "의 평균 점수는 " + grade.getAverage());
		System.out.println(grade.name + "의 최대 점수는 " + grade.getMax());
		System.out.println(grade.name + "의 최소 점수는 " + grade.getMin());

	}

}

package hw05;

import java.util.Scanner;

class DayDiary {
	String memo;
	
	void setMemo(String memo) {
		this.memo = memo;
	}
	
	String getMemo() {
		return memo;
	}
}

class MonthDiary {
	int year, month;
	DayDiary days[];
	
	public MonthDiary(int year, int month) {
		this.days = new DayDiary[30];
		this.year = year;
		this.month = month;
	}
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("***** %d년 %d월 다이어리 *****\n", year, month);
		while(true) {
			System.out.print("기록:1, 보기:2, 종료:3>>");
			int option = scanner.nextInt();
			if(option == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(option == 1) {
				System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>");
				this.write(scanner.nextInt(), scanner.next());
			}
			else if(option == 2) {
				this.show();	
			}
		}
		scanner.close();
	}
	
	void write(int day, String memo) {
		days[day] = new DayDiary();
		days[day].setMemo(memo); 
	}
	
	void show() {
		int count = 0;
		for(DayDiary day:days) {
			count++;
			String memo = (day == null) ? "…" : day.getMemo();
			System.out.printf("%4s ", memo);
			if(count % 7 == 0) System.out.println();
		}
		System.out.println();
	}

}

public class Ch4_10 {

	public static void main(String[] args) {
		MonthDiary monthDiary = new MonthDiary(2024, 10); // 2024년 10월 다이어리
		monthDiary.run();
	}

}

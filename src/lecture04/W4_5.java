package lecture04;

import java.util.Scanner;

class Player {
	String name;
	int score;
	int difference;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void win() {
		this.score++;
	}
	
	int getScore() {
		return this.score;
	}
	
	void setDifferece(int difference) {
		// 0 이상의 정수로 저장
		this.difference = (difference > 0) ? difference : difference * (-1);
	}
	
	int getDifference() {
		return this.difference;
	}
}

public class W4_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 게임 시작
		System.out.print("게임에 참여할 선수 수>>");
		Player players[] = new Player[scanner.nextInt()];
		for(int i=0; i<players.length; i++) {
			players[i] = new Player();
			System.out.printf("선수 %d 이름>>",i+1);
			players[i].setName(scanner.next());
		}
		
		// 게임 반복
		while(true) {
			int winner= 0;
			int answer = (int)(Math.random() * 100) + 1;
			System.out.println("1~100 사이의 숫자가 결정되었습니다.");
			for(int i=0; i<players.length; i++) {
				System.out.printf("%s>>", players[i].getName());
				players[i].setDifferece(scanner.nextInt() - answer);
				if(players[winner].getDifference() > players[i].getDifference()) {
					winner = i;
				}
			}
			System.out.printf("정답은 %d %s이 이겼습니다.\n", answer, players[winner].getName());
			players[winner].win();
			System.out.print("계속하려면 yes 입력>>");
			if(scanner.next().equals("no")) break;
		}
		
		// 게임 종료
		Player finalWinner = players[0];
		for(Player player:players) {
			System.out.printf(player.getName() + ":" + player.getScore() + " ");
			if(player.getScore() > finalWinner.getScore()) finalWinner = player;
		}
		System.out.printf("\n%s이 최종 승리하였습니다.", finalWinner.getName()); 
		scanner.close();
	}

}

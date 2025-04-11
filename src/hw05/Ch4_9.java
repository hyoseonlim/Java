package hw05;

import java.util.Scanner;

class Player {
	String name;
	int score;
	int guessNumber;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void win() {
		this.score++;
	}
}

public class Ch4_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 게임 시작
		System.out.println("*** 예측 게임을 시작합니다. ***");
		System.out.print("게임에 참여할 선수 수>>");
		int num = scanner.nextInt();
		Player players[] = new Player[num];
		for(int i=0; i<players.length; i++) {
			System.out.print("선수 이름>>");
			players[i] = new Player(scanner.next());
		}
		
		// 게임 진행
		boolean keepGoing = true;
		while(keepGoing) {
			int hiddenAnswer = (int)(Math.random() * 100 + 1);
			System.out.println("1~100 사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");
			for(int i=0; i<players.length; i++) {
				System.out.printf("%s>>", players[i].name);
				players[i].guessNumber = scanner.nextInt();
			}
			int winner = findWinner(hiddenAnswer, players);
			players[winner].win();
			System.out.printf("%s이 이겼습니다. 승점 1점 확보!", players[winner].name);
			System.out.print("\n계속하려면 yes 입력>>");
			if(scanner.next().equals("no")) keepGoing = false;
		}
		scanner.close();
		
		// 게임 마무리
		for(Player player:players) {
			System.out.printf("%s:%d ", player.name, player.score);
		}
		System.out.printf("\n%s이 최종 승리하였습니다.", finalWinner(players));
	}
	
	private static int findWinner(int answer, Player players[]) {
		int winner = 0;
		int min = Math.abs(answer - players[winner].guessNumber);
		for(int i=1; i<players.length; i++) {
			int diff = Math.abs(answer - players[i].guessNumber);
			if(min > diff) {
				min = diff;
				winner = i;
			}
		}
		return winner;
	}
	
	private static String finalWinner(Player players[]) {
		int winnerN = 0;
		int max = players[winnerN].score;
		for(int i=1; i<players.length; i++) {
			int score = players[i].score;
			if(max < score) {
				max = score;
				winnerN = i;
			}
		}
		return players[winnerN].name;
	}

}

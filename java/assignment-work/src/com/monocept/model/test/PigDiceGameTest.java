package com.monocept.model.test;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGameTest {
	private int score=0;
	private void gameStart() {
		int turn = 0;
		while (true) {
			this.score += diceRoll();
			turn++;
			if (this.score >= 20)
				break;
		}
		System.out.println("it take " + turn + " you to complete game and your score is " + score);
	}

	private int diceRoll() {
		int temp = 0;
		while (true) {
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			int dice = rand.nextInt(6) + 1;
			System.out.println("your dice score " + dice);
			temp += dice;
			if (dice == 1)
				return 0;
			if (this.score+temp >= 20)
				return temp;
			System.out.println("Roll or Hold? (r/h)");
			char choice = sc.next().charAt(0);
			if (choice == 'h' || choice == 'H')
				continue;
			return temp;
		}
	}

	public static void main(String[] args) {
		PigDiceGameTest ob=new PigDiceGameTest();
		ob.gameStart();
	}
}

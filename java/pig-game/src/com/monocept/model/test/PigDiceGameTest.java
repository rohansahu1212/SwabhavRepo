package com.monocept.model.test;

import java.util.Random;

import java.util.Scanner;

public class PigDiceGameTest {
	private int score = 0;
	private static int turn = 1;

	private void gameStart() {

		while (true) {
			int temp = diceRoll();
			this.score += temp;
			//turn++;
			System.out.println("------------------------------------------");
			System.out.println("your turn score is " + temp);
			System.out.println("your total score is " + this.score);
			System.out.println("your total number of turn " + turn++);
			System.out.println("------------------------------------------");
			System.out.println();
			if (this.score >= 20)
				break;
		}
		System.out.println("it take " + turn + " attempts you to complete game and your score is " + score);
	}

	private int diceRoll() {
		int temp = 0;
		while (true) {
			System.out.println("TURN " + turn);
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			int dice = rand.nextInt(6) + 1;
			System.out.println("Roll or Hold? (r/h)");
			char choice = sc.next().charAt(0);
			if (choice == 'h' || choice == 'H')
				return temp;
			System.out.println("your dice score " + dice);
			temp += dice;
			if (dice == 1)
				return 0;
			if (this.score + temp >= 20)
				return temp;
			if (choice == 'r' || choice == 'R') 
				continue;
			return temp;
		}
	}

	public static void main(String[] args) {
		PigDiceGameTest ob = new PigDiceGameTest();
		System.out.println("*See how many turn it take you to get to 20");
		System.out.println("Trun ends when you hold or roll a 1");
		System.out.println("If you roll a 1, you lose all points for the turn");
		System.out.println("If you hold, you save all the points for the turn");
		ob.gameStart();
	}
}

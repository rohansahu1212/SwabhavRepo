package com.monocept.game.test;

import java.util.Random;
import java.util.Scanner;

public class CricketBookGame {
	private int[] scores = new int[2];
	private int[] turns = new int[2];
	static int player = 0;

	public static void main(String[] args) {
		CricketBookGame ob = new CricketBookGame();
		ob.runGame();
		ob.scoreCard();
		player++;
		ob.runGame();
		ob.scoreCard();
		ob.resultCard();

	}

	private void runGame() {
		String choice;
		System.out.println("Player " + (player + 1) + " turn");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int i = 0;
		while (true) {
			System.out.println("Roll book (press r) or press E to exit");
			choice = sc.nextLine();
			if (choice.equalsIgnoreCase("e"))
				break;
			int generatedNumber = random.nextInt(300);
			int score = (generatedNumber % 10) % 7;
			this.scores[player] += score;
			this.turns[player] += 1;
			System.out.println("You score " + score);
			if (scores[0] < scores[1] || score == 0)
				break;

		}

	}

	private void resultCard() {
		String result = "";
		if (scores[0] > scores[1])
			System.out.println("player 1 wins");
		if (scores[0] < scores[1])
			System.out.println("player 2 wins");

		if (scores[0] == scores[1]) {
			result = (turns[0] > turns[1]) ? "one" : "two";
			System.out.println("Player " + result + "Wins");
		}

	}

	public void scoreCard() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Total score " + scores[player]);
		System.out.println("Total turn " + turns[player]);
		System.out.println("------------------------------------------------------------");
	}

}

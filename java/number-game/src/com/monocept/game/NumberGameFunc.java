package com.monocept.game;

import java.util.Scanner;

public class NumberGameFunc {
	public static void numGame() {
		while (true) {
			int userInput;
			int countGuess = 0;
			char choice;
			int maxCount = 10;
			int randomNumber = (int) (Math.random() * (100 - 0 + 1) + 0);
			Scanner sc = new Scanner(System.in);
			while (true) {

				System.out.println("Try your Guess");
				userInput = sc.nextInt();
				if (userInput < randomNumber)
					System.out.println("Sorry, Too Low");

				if (userInput > randomNumber)
					System.out.println("Soryy, Too High");

				if (userInput == randomNumber) {
					System.out.println("You take attempt " + countGuess + " solve it");
					break;
				}
				if (countGuess == maxCount) {
					System.out.println("You ran out of luck");
					break;
				}
				countGuess++;
			}
			System.out.println("Press y to continue and press n to exit");
			choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				continue;
			}
			break;
		}
	}

}

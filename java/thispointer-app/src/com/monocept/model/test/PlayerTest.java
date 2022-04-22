package com.monocept.model.test;

import com.monocept.model.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player sachin = new Player(12, "sachin", 45);
		printDetails(sachin);
		Player virat = new Player(12, "virat", 50);
		System.out.println("who is older " + sachin.whoIsOlder(virat).getName());
		// Player pass = sachin.whoIsOlder(virat);
		System.out.println("Details of all older player");
		printDetails(sachin.whoIsOlder(virat));

	}

	public static void printDetails(Player player) {

		System.out.println("player id " + player.getId());
		System.out.println("Player name " + player.getName());
		System.out.println("player age " + player.getAge());

	}

}

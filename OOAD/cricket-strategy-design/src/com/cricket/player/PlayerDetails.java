package com.cricket.player;

import com.cricket.player.type.PlayerType;

public class PlayerDetails {
	private String name;
	private int age;
	private PlayerType type;

	public PlayerDetails(String name, int age, PlayerType type) {

		this.name = name;
		this.age = age;
		this.type = type;
	}

	public void printDetials() {
		System.out.println("Name of player : " + name);
		System.out.println("Name of age : " + age);
		System.out.println("Contribution in team : " + type.contributionInTeam());
		System.out.println();
	}
}

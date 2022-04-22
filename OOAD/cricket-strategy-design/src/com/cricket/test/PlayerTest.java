package com.cricket.test;

import com.cricket.player.PlayerDetails;
import com.cricket.player.type.AllRounder;
import com.cricket.player.type.Batsman;
import com.cricket.player.type.Bowler;

public class PlayerTest {
	public static void main(String[] args) {
		PlayerDetails pd1 = new PlayerDetails("Rohan", 24, new Batsman());
		pd1.printDetials();

		PlayerDetails pd2 = new PlayerDetails("Shikhar", 34, new Bowler());
		pd2.printDetials();

		PlayerDetails pd3 = new PlayerDetails("Ankit", 50, PlayerTest::empior);
		pd3.printDetials();

		PlayerDetails pd4 = new PlayerDetails("Shitik", 50, () -> {
			return "I am from Staff";
		});
		pd4.printDetials();

		PlayerDetails pd5 = new PlayerDetails("Kapil Dev", 24, new AllRounder());
		pd5.printDetials();

	}

	static String empior() {
		return "I do Empioring";
	}
}

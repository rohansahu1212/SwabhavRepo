package com.monocept.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DiceRoll {

	public int getDiceRoll() {

		Random ran = new Random();
		int diceRoll = ran.nextInt(6) + 1;
		return diceRoll;

	}

	public Map<Integer, Integer> getFrequencyCount(int limit) {
		Map<Integer, Integer> diceOccureds = new HashMap<Integer, Integer>();

		for (int i = 0; i < limit; i++) {

			int value = getDiceRoll();

			if (diceOccureds.containsKey(value))
				diceOccureds.put(value, diceOccureds.get(value) + 1);

			if (!diceOccureds.containsKey(value))
				diceOccureds.put(value, 1);
		
		}
		return diceOccureds;
	}

}

package com.monocept.model.JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.monocept.model.DiceRoll;

class DiceTestCases {

	@Test
	void countFrequncyLessThan10() {
		DiceRoll diceRoll = new DiceRoll();
		Map<Integer, Integer> diceOcuureds = diceRoll.getFrequencyCount(10);// fi
		int expectedCount = 10;
		int actualCount = 0;
		for (int itr : diceOcuureds.keySet())
			actualCount += diceOcuureds.get(itr);
		assertEquals(expectedCount, actualCount);
	}

	@Test
	void diceRollBetween0to6() {
		DiceRoll diceRoll = new DiceRoll();
		for (int i = 0; i < 50; i++) {
			int diceValue = diceRoll.getDiceRoll();
			assertTrue(0 < diceValue && diceValue < 7);
		}

	}

}

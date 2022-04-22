package com.monocept.test;

import java.util.HashMap;
import java.util.Map;

import com.monocept.model.DiceRoll;

public class DiceFrequencyTest {
	public static void main(String[] args) {
		DiceRoll diceRoll = new DiceRoll();
		Map<Integer, Integer> frequencyValues = diceRoll.getFrequencyCount(10);

		for (int value : diceRoll.getFrequencyCount(10).keySet()) {

			System.out.println(value + " occured " + frequencyValues.get(value));

		}
	}
}

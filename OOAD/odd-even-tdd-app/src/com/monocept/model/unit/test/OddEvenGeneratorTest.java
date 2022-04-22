package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.custom.exception.NegativeValueNotAllowed;
import com.monocept.model.OddEvenGenerator;

class OddEvenGeneratorTest {

	@Test
	void negtiveValueShouldNotAllow() {
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] result = generator.getEvenNosTill(10);
		assertThrows(NegativeValueNotAllowed.class, () -> generator.getEvenNosTill(-12), "Negative not Allowed");
		// assertError(class1, generator);
	}

	@Test
	void evenTilShouldGenerate5EvenNosInput10() {
		int expectedEvenNosSize = 5;
		int[] expectedEvenNos = { 2, 4, 6, 8, 10 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] envos = generator.getEvenNosTill(10);
		assertTrue(envos.length == expectedEvenNosSize);
	}

	@Test
	void oddTilShouldGenerate5OddNosInput10() {
		int expectedOddNosSize = 5;
		int[] expectedOddNos = { 1, 3, 5, 7, 9 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] oddVals = generator.getOddNosTill(10);
		assertTrue(oddVals.length == expectedOddNosSize);

	}

	@Test
	void oddTilShouldGenerate5OddNosInput11AndValueMatch() {
		int expectedOddNosSize = 5;
		int[] expectedOddNos = { 1, 3, 5, 7, 9 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] oddVals = generator.getOddNosTill(11);
		assertArrayEquals(oddVals, expectedOddNos);
	}

	@Test
	void oddTilShouldGenerate6OddNosInput13() {
		int expectedOddNosSize = 6;
		int[] expectedOddNos = { 1, 3, 5, 7, 9, 11 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] oddVals = generator.getOddNosTill(13);
		assertTrue(oddVals.length == expectedOddNosSize);
	}

}

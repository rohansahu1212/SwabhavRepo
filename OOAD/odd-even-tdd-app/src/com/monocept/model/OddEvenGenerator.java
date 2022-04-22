package com.monocept.model;

import com.monocept.custom.exception.NegativeValueNotAllowed;

public class OddEvenGenerator {

	public int[] getEvenNosTill(int limit) {

		if (limit < 0)
			throw new NegativeValueNotAllowed("negative not allowed");

		int size = limit / 2;
		int[] evenNumbers = new int[size];
		for (int no = 2, index = 0; no <= limit; no += 2, index++) {
			evenNumbers[index] = no;
		}

		return evenNumbers;
	}

	public int[] getOddNosTill(int limit) {

		if (limit < 0)
			throw new NegativeValueNotAllowed("negative not allowed");

		int size = limit / 2;
		int[] oddNums = new int[size];
		for (int no = 1, index = 0; no < limit; no += 2, index++)
			oddNums[index] = no;
		return oddNums;
	}
}

package com.monocept.model.test;

import com.monocept.model.NotEigibleToVote;

public class CustomExceptionTest {
	public static void main(String[] args) throws NotEigibleToVote {

		vote(12);

	}

	private static void vote(int age) throws NotEigibleToVote {
		if (age < 18)
			throw new NotEigibleToVote("you are under age ");
		System.out.println("you can vote");
	}
}

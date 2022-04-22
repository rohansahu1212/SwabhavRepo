package com.monocept.game;

public class EvenOdd {
	public void evenNumber() {
		System.out.println("List of even number upto 100");
		for (int i = 0; i <= 100; i += 2)
			System.out.println(i);
	}

	public void oddNumber() {
		System.out.println("List of odd number upto 100");
		for (int i = 1; i <= 100; i += 2)
			System.out.println(i);
	}

}

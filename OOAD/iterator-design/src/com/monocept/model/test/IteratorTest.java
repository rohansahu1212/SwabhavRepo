package com.monocept.model.test;

import java.util.Iterator;

import com.monocept.model.NameRepositary;
import com.monocept.model.NamesArrayIterator;

public class IteratorTest {
	public static void main(String[] args) {

		NameRepositary repo = new NameRepositary("Rohan,himanshu,abhishek,vineet ,shikhar");

		Iterator itr = repo.creatIterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}

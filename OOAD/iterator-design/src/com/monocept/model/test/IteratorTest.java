package com.monocept.model.test;

import java.util.Iterator;

import com.monocept.model.NameRepositary;
import com.monocept.model.NamesArrayIterator;

public class IteratorTest {
	public static void main(String[] args) {
		String[] names = { "rohan", "sahu","ankit" };
		// Iterator it=new NamesArrayIterator(1, new NameRepositary(names));

		NameRepositary nr = new NameRepositary(names);
		Iterator itr = nr.creatIterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}

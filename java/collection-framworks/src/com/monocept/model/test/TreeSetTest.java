package com.monocept.model.test;

import java.util.*;

class TreeSetTest {

	public static void main(String[] args) {

		NavigableSet<String> treeSet = new TreeSet<>();

		treeSet.add("Vijay");
		treeSet.add("Ankit");
		treeSet.add("Rohan");
		treeSet.remove("Rohan");
		System.out.println("Tree Set is " + treeSet);

		String check = "Rohan";

		System.out.println("Contains " + check + " " + treeSet.contains(check));

		System.out.println("First Value " + treeSet.first());

		System.out.println("Last Value " + treeSet.last());

		String val = "Geek";

		System.out.println("Higher " + treeSet.higher(val));
		System.out.println("Lower " + treeSet.lower(val));
	}
}

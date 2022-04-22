package com.monocept.model.test;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<ArrayList> set = new HashSet<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list2.add(1);
//		list2.add(2);
//		list2.add(5);
//		list2.add(6);
//		list2.add(6);
//		list2.add(27);
//		list2.add(7);
		set.add(list1);
		set.add(list2);
		System.out.println(set);

		System.out.println(set.size());
		set.remove(list2);
		System.out.println(set);
	}
}

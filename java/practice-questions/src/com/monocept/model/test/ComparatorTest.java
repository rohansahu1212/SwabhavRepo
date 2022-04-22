package com.monocept.model.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(101);
		values.add(127);
		values.add(313);
		values.add(409);
		values.add(552);

		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > 02 % 10)
					return 1;
				return -1;

			}
		};
		
		Collections.sort(values, com);
		System.out.println(values);
	}
}

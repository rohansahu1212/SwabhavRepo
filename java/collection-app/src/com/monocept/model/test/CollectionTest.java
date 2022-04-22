package com.monocept.model.test;

import java.util.ArrayList;

import com.monocept.model.LineItem;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new LineItem(11, "cinthol", 2, 50));
		list.add(new LineItem(12, "powder", 4, 40));
		list.add(new LineItem(13, "neva cream", 1, 20));
		list.add(new LineItem(14, "almond hair oil", 2, 300));
		list.add(new LineItem(15, "life boy", 4, 50));
		list.add(new LineItem(16, "dove shampoo", 2, 50));
		list.add("monocept");

		for (Object obj : list) {
	     System.out.println(obj.toString());
		}
	}
}

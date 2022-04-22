package com.monocept.model.test;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("rohan");
		list.addFirst("is");
		list.addFirst("here");
		list.addLast(".......... bye");
		System.out.println(list);
		list.clear();
		System.out.println(list);
		list.addFirst("rohan");
		list.addFirst("is");
		list.addFirst("here");
		list.addLast("over and out");
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
	}
}

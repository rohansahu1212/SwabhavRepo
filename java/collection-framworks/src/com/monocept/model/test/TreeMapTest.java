package com.monocept.model.test;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

	
		treeMap.put(2, "rohan");
		treeMap.put(3, "is ");
		treeMap.put(3, "is coding right ");
		treeMap.put(4, "now");
		treeMap.put(1, "hey,");
		treeMap.remove(1);

		
		System.out.println("TreeMap: " + treeMap);
	}
}

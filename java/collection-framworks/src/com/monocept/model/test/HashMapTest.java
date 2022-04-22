package com.monocept.model.test;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		
		map.put("vishal", 24);
		map.put("sachin", 32);
		map.put("rohan", 20);
		map.put("shikhar", 23);
		map.put("ankit", 16);


		
		System.out.println("Size of map is:- " + map.size());

		System.out.println(map);
		map.remove("rohan");
		System.out.println("After removing "+map);
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		 System.out.println("using iterator "+itr.next());
		

		
		if (map.containsKey("vishal")) {

			System.out.println("value for key" + " \"vishal\" is:- " + map.get("vishal"));
		}
		
	}
}

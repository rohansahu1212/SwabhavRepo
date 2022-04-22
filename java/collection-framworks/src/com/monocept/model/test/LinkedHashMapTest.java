package com.monocept.model.test;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		
		lhm.put("rohan", "sahu");
		lhm.put("akkula", "ramya");
		lhm.put("shikhar", "singh");
		lhm.put("vineet", "singh");
		System.out.println(lhm);
		
		lhm.remove("shikhar");
		System.out.println(lhm);
		
		System.out.println("value of key 'Rohan': " + lhm.get("rohan"));
		
		System.out.println("Size : " + lhm.size());
		
		System.out.println("Contains key 'shikhar'? " + lhm.containsKey("shikhar"));
		
		System.out.println("Mappings of LinkedHashMap : " + lhm);
		
	}
}

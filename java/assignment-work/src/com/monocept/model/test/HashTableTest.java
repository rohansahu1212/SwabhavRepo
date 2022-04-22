package com.monocept.model.test;

import java.io.*;
import java.util.*;

class HashTableTest {
	public static void main(String args[]) {
		// No need to mention the
		// Generic type twice
		Hashtable<Integer, Integer> ht1 = new Hashtable<>();

	
		Hashtable<String, String> ht2 = new Hashtable<>();

		// Inserting the Elements
	
		ht1.put(1, 12);
		ht1.put(2, 24);
		ht1.put(3, 36);

		ht2.put("Rohan","Sahu");
		ht2.put("Shikhar", "Singh");
		ht2.put("Vijay", "Laxmi");

		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}

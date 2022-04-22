package com.monocept.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardTest {
	
	public static void main(String args[]) {
		
		List<String> names = Arrays.asList("vijay","Rohan","ankit");
		printDetails(names);
		
		List<Integer> nos = Arrays.asList(10,20,30,40);
		printDetails(nos);
	}
	
	static void printDetails(List<?> items ) {
		//items.add(100, null);
		items.forEach(System.out::println);
	}
}

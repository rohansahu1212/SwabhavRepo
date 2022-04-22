package com.monocept.model.test;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();//
		list.add("rohan");//
		list.add("ankit");
		list.add("shikhar");
		list.add("piyush");
		list.set(0,"aakash");
		System.out.println(list);
		System.out.println("pointing element " + list.get(1));
		  Collections.sort(list);
		list.set(1, "Dates");
//		for(String name:list)
//			System.out.println(name);
	    java.util.Iterator<String> it = list.iterator();

	    // Print the first item
	    System.out.println(it.next());
		
		  List<Integer> list2=new ArrayList<Integer>();  
		  System.out.println("elements before sorting"+list2);
		  list2.add(21);  
		  list2.add(11);  
		  list2.add(51);  
		  list2.add(1);  
		  Collections.sort(list2); 
		  System.out.println(list2);
		  list2.remove(0);
		  System.out.println("after reomving 1 st element "+list2);
	}
}

package com.monocept.model.test;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedHashSetTest {

	public static void main(String[] args) {

		LinkedHashSet<String> linkSets = new LinkedHashSet<String>();

		linkSets.add("A");
		linkSets.add("K");
		linkSets.add("Z");
		linkSets.add("D");

		linkSets.add("A");
		linkSets.add("E");

		System.out.println("Size of LinkedHashSet = " + linkSets.size());

		System.out.println("Original LinkedHashSet:" + linkSets);
		linkSets.remove("D");
		System.out.println("Removing D from LinkedHashSet: " + linkSets);
		TreeSet<String> treeset = new TreeSet<String>(linkSets);
		System.out.println("Updateding  LinkedHashSet and after sorting: " + treeset);
		
	    }
	}


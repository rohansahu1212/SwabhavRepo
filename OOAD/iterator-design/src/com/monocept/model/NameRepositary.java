package com.monocept.model;

import java.util.Arrays;
import java.util.Iterator;

public class NameRepositary {
	private String[] names;
	
	public NameRepositary(String[] names) {
		this.names = names;
	}

	public Iterator creatIterator() {
		return Arrays.asList(names).iterator();
	}

}

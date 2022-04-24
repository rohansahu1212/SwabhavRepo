package com.monocept.model;

import java.util.Arrays;
import java.util.Iterator;

public class NameRepositary {
	private String[] names;
	
	public NameRepositary(String names) {
		setNames(names.split(","));
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public Iterator creatIterator() {
		return new NamesArrayIterator(this);
	}

}

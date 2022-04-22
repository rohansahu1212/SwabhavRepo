package com.monocept.model;

import java.util.Iterator;

public class NamesArrayIterator implements Iterator {
     private int index;
     private NameRepositary repo;
     
     
	public NamesArrayIterator(int index, NameRepositary repo) {
		this.index = index;
		this.repo = repo;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return repo!=null;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}

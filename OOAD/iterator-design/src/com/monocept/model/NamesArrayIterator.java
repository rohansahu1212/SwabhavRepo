package com.monocept.model;

import java.util.Iterator;

public class NamesArrayIterator implements Iterator {
     private int index=0;
     private NameRepositary repo;
     
     
	public NamesArrayIterator( NameRepositary repo) {
		this.repo = repo;
	}

	@Override
	public boolean hasNext() {
		return index < repo.getNames().length;
	}

	public NameRepositary getRepo() {
		return repo;
	}


	@Override
	public Object next() {
		Object value= repo.getNames()[index];
		index++;
		
		return value;
	}

}

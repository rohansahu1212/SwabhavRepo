package com.monocept.model;

import java.util.Comparator;

public class SortByFirstNameStrategy implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if((o1.getFirstName().compareTo(o2.getFirstName()))>0)
			return 1;
		if((o1.getFirstName().compareTo(o2.getFirstName()))<0)
			return -1;	
		return 0;
		
	}

}

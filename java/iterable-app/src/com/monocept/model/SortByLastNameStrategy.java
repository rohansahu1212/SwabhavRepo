package com.monocept.model;

import java.util.Comparator;

public class SortByLastNameStrategy implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getLastName().compareTo(o2.getLastName())>0)
			return 1;
		if(o1.getLastName().compareTo(o2.getLastName())<0)
			return -1;
		return 0;
	}



}

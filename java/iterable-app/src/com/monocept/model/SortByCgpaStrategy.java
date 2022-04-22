package com.monocept.model;

import java.util.Comparator;

public class SortByCgpaStrategy implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getCgpa()-o2.getCgpa()>0)
			return 1;
		if(o1.getCgpa()-o2.getCgpa()<0)
			return -1;
		return 0;
	}

}

package com.monocept.model;

import com.monocept.model.AnnotationDeployment.MyNeedToRefactor;

public class AnnotationTwo {
	@NeedToRecfator
	public void m1() {
		System.out.println("Annotion two m1");

	}

	public void m2() {

		System.out.println("Annotion two m2");
	}
}

package com.monocept.model;

import com.monocept.model.AnnotationDeployment.MyNeed;
import com.monocept.model.AnnotationDeployment.MyNeedToRefactor;
@MyNeed
public class AnnotationOne {
	@NeedToRecfator
	public void m1() {
		System.out.println("Annotion one m1");

	}

	public void m2() {

		System.out.println("Annotion one m2");
	}
   @NeedToRecfator
	public void m3() {

		System.out.println("Annotion one m3");
	}

	public void m4() {

		System.out.println("Annotion one m4");
	}
}

package com.monocept.model.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.monocept.model.AnnotationDeployment;
import com.monocept.model.AnnotationOne;
import com.monocept.model.AnnotationTwo;
import com.monocept.model.NeedToRecfator;
import com.monocept.model.AnnotationDeployment.MyNeedToRefactor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectorTest {

	public static void main(String[] args) {
		findAllMethodNeedingRefactor(AnnotationOne.class);
		findAllMethodNeedingRefactor(AnnotationTwo.class);

	}

	public static void findAllMethodNeedingRefactor(Class className) {
		int count = 0;
		Method[] methods = className.getMethods();
		for (Method meth : methods) {
			if (meth.isAnnotationPresent(NeedToRecfator.class)) { //
				System.out.println("Method "+meth.getName());
			}

		}
	
	}

}
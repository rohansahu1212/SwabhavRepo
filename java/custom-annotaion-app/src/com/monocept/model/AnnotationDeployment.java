package com.monocept.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

public class AnnotationDeployment extends Annotation {
	public AnnotationDeployment(Object value) {
		super(value);
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public
	@interface MyNeedToRefactor{
		String name() default "need to refactor";
	}
	
	
	
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public
	@interface MyNeed{
		int num() default 12;
	}
}

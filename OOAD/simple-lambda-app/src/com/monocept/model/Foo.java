package com.monocept.model;

public class Foo implements IMathOperation {



	@Override
	public Long doOperation(int a, int b) {
		
		return (long)a+b;
	}

}

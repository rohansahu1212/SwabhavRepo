package com.monocept.custom.exception;

public class NegativeValueNotAllowed extends RuntimeException{

	public NegativeValueNotAllowed(String string) {
		super(string);
	}

}

package com.monocept.model;

public class NotEigibleToVote extends RuntimeException {
	public NotEigibleToVote(String message) {
		super(message);
	}

}

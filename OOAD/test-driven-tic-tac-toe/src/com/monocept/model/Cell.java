package com.monocept.model;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class Cell {

	private Mark mark = Mark.EMPTY;

	public Boolean isCellEmpty() {
		return (mark == Mark.EMPTY);
	}

	public void setMark(Mark mrk) {
		if (isCellEmpty())
			mark = mrk;
		else
			throw new RuntimeException("cell already is marked");

	}

	public Mark getMark() {
		return (mark);
	}

}

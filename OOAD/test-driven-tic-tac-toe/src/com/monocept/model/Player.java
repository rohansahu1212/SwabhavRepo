package com.monocept.model;

public class Player {
	private String name;
	private Mark mrk;

	public Player(String name, Mark mrk) {

		this.name = name;
		this.mrk = mrk;
	}

	public String getName() {
		return name;
	}

	public Mark getMrk() {
		return mrk;
	}

}

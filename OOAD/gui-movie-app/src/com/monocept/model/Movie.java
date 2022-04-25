package com.monocept.model;

import java.io.Serializable;

public class Movie implements Serializable {
	private String name;
	private String genre;
	private int year;

	public Movie(String name, String genre, int year) {
		this.name = name;
		this.genre = genre;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

}

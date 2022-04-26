package com.monocept.model;

import java.io.Serializable;

public class Movie implements Serializable {
	@Override
	public String toString() {
		return "name=" + name + ", genre=" + genre + ", year=" + year + "\n";
	}

	private String name;
	private String genre;
	private String year;

	public Movie(String name, String genre, String year2) {
		this.name = name;
		this.genre = genre;
		this.year = year2;
	}

	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}

	public String getYear() {
		return year;
	}

}

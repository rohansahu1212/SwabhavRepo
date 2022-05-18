package com.monocept.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie {
	@Id
	private int mid;
	@Column(name = "movie_name")
	private String movieName;
	@ManyToMany(mappedBy = "movies")
	private List<Actor> actors;

	public Movie() {
		super();

	}

	public Movie(int mid, String movieName, List<Actor> actors) {
		super();
		this.mid = mid;
		this.movieName = movieName;
		this.actors = actors;
	}

	public int getMid() {
		return this.mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}

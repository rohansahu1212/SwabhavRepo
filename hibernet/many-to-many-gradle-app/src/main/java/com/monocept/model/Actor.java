package com.monocept.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
	@Id
	private int aid;
	private String actorName;
	@ManyToMany
	@JoinTable
	private List<Movie> movies;

	public Actor(int aid, String actorName, List<Movie> movies) {
		super();
		this.aid = aid;
		this.actorName = actorName;
		this.movies = movies;
	}

	public Actor() {
		super();

	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

}

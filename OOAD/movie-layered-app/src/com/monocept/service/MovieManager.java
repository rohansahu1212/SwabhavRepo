package com.monocept.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Movie;
import com.sun.org.apache.bcel.internal.generic.LoadClass;

public class MovieManager {

	List<Movie> movies=new ArrayList<Movie>();
	public MovieManager () throws IOException {
		previousState();
	}

	public List<Movie> getMovies() {
		
		return movies;
	}

	public void clearMovie() throws IOException {
		movies.clear();
		saveState();
	}

	public void addMovie(Movie movie) throws IOException {
		previousState();
		movies.add(movie);
		saveState();
	}
	public int getCount() throws IOException {
		previousState();
		return movies.size();
	}


	public void previousState() throws IOException {
		try {
			FileInputStream file = new FileInputStream("movieDB.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			movies = (List<Movie>) in.readObject();
			if(movies==null)
				saveState();
			in.close();
			file.close();
		} catch (Exception e) {
			
			saveState();
		}
	}

	public void saveState() throws IOException {
		FileOutputStream file = new FileOutputStream("movieDB.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(movies);
		out.close();
		file.close();

	}
}

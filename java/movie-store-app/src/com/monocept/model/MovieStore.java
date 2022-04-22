package com.monocept.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import com.monocept.model.test.MovieStoreTest;

public class MovieStore implements Serializable {
	private String movieName[] = new String[5];
	private String genre[] = new String[5];
	private int year[] = new int[5];
	private int[] idMovie = new int[5];

	private int idGenerator = 0;

	public void addMovie() throws IOException {
		if (idGenerator >= 5) {
			System.out.println("Movie Store is full ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Name");
		this.movieName[this.idGenerator] = sc.nextLine();
		System.out.println("Movie Genre");
		this.genre[this.idGenerator] = sc.nextLine();
		System.out.println("Movie Year ");
		this.year[this.idGenerator] = sc.nextInt();
		this.idMovie[this.idGenerator] += this.idGenerator;
		this.idGenerator++;
		saveState(this);

	}

	public void saveState(MovieStore movie) throws IOException {
		FileOutputStream file = new FileOutputStream("movie-info.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		obj.writeObject(movie);
		obj.close();
		file.close();
	}

	public MovieStore previousState() throws IOException {
		MovieStore state = null;
		try {
			FileInputStream file = new FileInputStream("movie-info.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			state = (MovieStore) in.readObject();
		} catch (Exception e) {
			MovieStore movie = new MovieStore();
			FileOutputStream file = new FileOutputStream("movie-info.txt");
			ObjectOutputStream obj = new ObjectOutputStream(file);
			obj.writeObject(movie);
			obj.close();
			file.close();
			state = movie;
		}
		return state;
	}

	public void clearAll() throws IOException {
		this.idGenerator = 0;
		System.out.println("Moive Cleared");
		saveState(this);
	}
	public int getMovieCount() {
		return this.idGenerator;
	}

	public void displayMovies() throws IOException {
		if (this.idGenerator == 0) {
			System.out.println("No movies Available");
		}
		for (int i = 0; i < this.idGenerator; i++) {
			System.out.println ("---------------------- ");
			System.out.println("Movie Name "+this.movieName[i]);
			System.out.println("Moive Genre"+this.genre[i]);
			System.out.println("Movie Year"+this.year[i]);
			System.out.println ("---------------------- ");

		}
	}

}

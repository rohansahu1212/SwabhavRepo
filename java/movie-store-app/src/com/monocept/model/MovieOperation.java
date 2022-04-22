package com.monocept.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class MovieOperation implements Serializable {
	String path = "movie-info.txt";
	private String movieName;
	private String genre;
	private int year;
	private int movieId;



	public MovieOperation(String movieName, int year, String genre) {
		this.movieName = movieName;
		this.year = year;
		this.genre = genre;
	}
	public String getMovie() {
		return movieName;
	}
	public String getGenre() {
		return genre;
	}
	public MovieOperation() {
		this("", 0, "");
	}

	public int movieListLenght() throws FileNotFoundException {
		int countMovie = 0;
		File f = new File(path);
		Scanner myReader = new Scanner(f);
		while (myReader.hasNext()) {
			myReader.nextLine();
			countMovie++;
		}
		return countMovie;
	}

	public void displayMovie() throws FileNotFoundException {
		System.out.println("run");
		File f = new File(path);
		Scanner myReader = new Scanner(f);
		while (myReader.hasNext()) {
			System.out.println(myReader.nextLine());
		}
	}
  public void printObject(MovieOperation ob) {
System.out.println(ob.year);	  
System.out.println(ob.genre);	  
System.out.println(ob.movieName);	  
  }
	public void clearAll() throws IOException {
		FileWriter fw = new FileWriter(path);
		fw.write("");
		fw.close();
	}
}

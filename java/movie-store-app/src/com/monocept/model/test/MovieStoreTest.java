package com.monocept.model.test;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.MovieStore;

public class MovieStoreTest {
	public static void main(String[] args) throws IOException {
		MovieStore ob = new MovieStore();
		ob=ob.previousState();
		Scanner sc = new Scanner(System.in);
		String choice;
		System.out.println("Welcome to Movie Store Developed by : Rohan");
		while (true) {
			System.out.println("Movie Count " + ob.getMovieCount());
			System.out.println("1. Add movie");
			System.out.println("2. Display movie");
			System.out.println("3. Clear Movie");
			System.out.println("4. Exit ");
			choice = sc.next();
			if (choice.equalsIgnoreCase("1"))
				ob.addMovie();
			if (choice.equalsIgnoreCase("2"))
				ob.displayMovies();
			if (choice.equalsIgnoreCase("3"))
				ob.clearAll();
			if (choice.equalsIgnoreCase("4"))
				break;
		}

	}
}

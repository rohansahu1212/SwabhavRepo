package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.monocept.model.MovieOperation;

public class MovieMenuTest {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Movie Store developed by: Rohan Sahu");
		MovieOperation ob = new MovieOperation();

		while (true) {
			System.out.println("Movie count " + ob.movieListLenght() + "/5");
			System.out.println("1- Add movie");
			System.out.println("2- Display all Movies");
			System.out.println("3- Clear all Movies");
			System.out.println("4- Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 1) {
				movieAdd();
			}
			if (choice == 2) {
				printDeatils();
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("  ");
			}
			if (choice == 3) {
				
				
				ArrayList<Object> permanentStorage = new ArrayList<Object>();
				permanentStorage.removeAll(permanentStorage);
				FileOutputStream fop = new FileOutputStream("movie-info.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fop);
				permanentStorage.add("");
				oos.writeObject(permanentStorage);
				System.out.println("Memory clear");
			}
			if (choice == 4) {
				System.out.println("EXIT");
				break;
			}
		}
	}

	private static void movieAdd() throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name");
		String movieName = sc.next();
		System.out.println("Enter movie year");
		int year = sc.nextInt();
		System.out.println("Enter movie genre");
		String genre = sc.next();

		FileInputStream fin = new FileInputStream("movie-info.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		ArrayList<Object> tempStorage = (ArrayList<Object>) ois.readObject();
		
		MovieOperation wrob = new MovieOperation(movieName, year, genre);
		ArrayList<Object> permanentStorage = new ArrayList<Object>();
		permanentStorage = tempStorage;
		
		try {
			FileOutputStream fop = new FileOutputStream("movie-info.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			permanentStorage.add(wrob);
			oos.writeObject(permanentStorage);

		} catch (Exception e) {
			System.out.println("error in writing");
		}

	}
	
	private static void printDeatils() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("movie-info.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		ArrayList<Object> acc = (ArrayList<Object>) ois.readObject();
		int i=0;
		for (Object ob : acc) {
			if(i>0) {
				MovieOperation obb=(MovieOperation) ob;
				System.out.println(obb.getMovie());
				System.out.println(obb.getGenre());
			}
			i++;
		}
	}

}

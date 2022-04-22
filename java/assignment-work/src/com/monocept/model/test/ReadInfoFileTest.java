package com.monocept.model.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.monocept.model.TypeMessage;

public class ReadInfoFileTest {
	public static void main(String[] args) throws FileNotFoundException {
		String check = args[0].toUpperCase();
		String input;
		System.out.println(check);
		if (validate(check)) {
			input = check;
		}
		File f = new File("db_app.log");
		Scanner myReader = new Scanner(f);
		
		while(myReader.hasNext()) {
			String oneLine=myReader.nextLine();
			if(oneLine.matches(".*\\ - " +check+ " - \\b.*"))
				System.out.println(oneLine);
		}

	}

	private static boolean validate(String input) {
		if (TypeMessage.ERROR.toString().equals(input) || TypeMessage.INFO.toString().equals(input)
				|| TypeMessage.WARNING.toString().equals(input)) 
			return true;
		System.out.println("Not working ");
		return true;
	}
}

package com.monocept.rohan.sahu.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchLogMessage {
	public String analyze(String fileName, String logType) throws FileNotFoundException {
		String result = "";
		if (validateLogType(logType)) {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);

			while (sc.hasNext()) {
				String str = sc.nextLine() + "\n";
				if (str.contains("- " + logType + " -"))
					result = result + str + "\n";

			} // while end
			return result;
		}
		return "Log Type Not Match";
	}

	public boolean validateLogType(String input) {
		if ("ERROR".toString().equals(input) || "INFO".toString().equals(input) || "WARNING".toString().equals(input))
			return true;
		System.out.println("Not working ");
		return true;
	}
}

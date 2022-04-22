package com.monocept.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadDataTest {
	public static void main(String[] args) throws IOException {
		Path filepath = Paths.get("DBFile.txt");
		Files.lines(filepath).forEach(ReadDataTest::printDetails);
	}

	private static void printDetails(String line) {
		System.out.println(line);
	}
}

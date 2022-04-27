package com.monocept.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ReadDataFromUrl implements DataRead {

	@Override
	public HashSet<Employee> readContent() throws IOException {
		Path filepath = Paths.get("DBFile.txt");

		HashSet<Employee> empUrlList = new HashSet<Employee>();

		HashSet<Employee> empList = (HashSet<Employee>) Files.lines(filepath).map(x -> x.split(",")).map(x -> {
			return (new Employee(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7]));
		}).collect(Collectors.toSet());
		return empList;
	}

}

package com.monocept.model;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadDataTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Path filepath = Paths.get("DBFile.txt");

		HashSet<Employee> empUrlList = new HashSet<Employee>();

		HashSet<Employee> empList = (HashSet<Employee>) Files.lines(filepath).map(x -> x.split(",")).map(x -> {
			return (new Employee(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7]));
		}).collect(Collectors.toSet());

		empUrlList.forEach(x -> System.out.println(x.getEmployeeName()));

		// find ceo
		empList.stream().filter(e -> e.getJobId().contains("NULL")).forEach(x -> {
			System.out.println(x.getEmployeeName() + "       " + x.getSalary());
		});

		HashMap<String, Integer> jobWiseCount = new HashMap<String, Integer>();

		empList.stream().map(emp -> {
			if (!jobWiseCount.containsKey(emp.getJob()))
				jobWiseCount.put(emp.getJob(), 0);
			jobWiseCount.put(emp.getJob(), jobWiseCount.get(emp.getJob()) + 1);
			return null;
		}).forEach(x -> System.out.print(""));

		System.out.println(jobWiseCount);

	}

}

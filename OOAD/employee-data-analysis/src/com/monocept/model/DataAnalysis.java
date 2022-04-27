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

public class DataAnalysis {
	private DataRead dr;

	public DataAnalysis(DataRead dr) {
		this.dr = dr;
	}

	HashSet<Employee> empList = null;

	public void findCeo() throws IOException {

		empList = dr.readContent();

		// find ceo
		empList.stream().filter(e -> e.getJobId().contains("NULL")).forEach(x -> {
			System.out.println(x.getEmployeeName() + "       " + x.getSalary());
		});

	}

	public void jobWiseCount() throws IOException {
		empList = dr.readContent();
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

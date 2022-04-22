package com.monocept.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.HashSet;
import java.util.Scanner;

public class ImportDataFromUrl implements ImportData {


	@Override
	public HashSet<Employee> readContent() {
		HashSet<Employee> employees = new HashSet<Employee>();
		
		StringBuilder content = new StringBuilder();
		try {
			String urlAddress = "https://swabhav-tech.firebaseapp.com/emp.txt";
			URL url = new URL(urlAddress);
			URLConnection urlConnection = url.openConnection();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				content.append(line + "\n");
			}
			bufferedReader.close();
			String file = content.toString();
			Scanner scanner = new Scanner(file);

			/////////////////

			while (scanner.hasNextLine()) {
				String line1 = scanner.nextLine();
				String[] employee1 = line1.split(",");
				employees.add(new Employee(employee1[0], employee1[1], employee1[2], employee1[3], employee1[4],
						employee1[5], employee1[6], employee1[7]));
			}
			return employees;

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return employees;
	}
}
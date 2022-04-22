package com.monocept.model.test;

import java.io.FileReader;
import java.util.Properties;

public class FileProperties {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("file.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("email"));
	}
}

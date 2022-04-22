package com.monocept.model.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		File file = new File("rohan.txt");
		 BufferedReader br= new BufferedReader(new FileReader(file));
		 String message;
		 while ((message = br.readLine()) != null)
			 System.out.println(message);
		 
		 br.close();
	}
}

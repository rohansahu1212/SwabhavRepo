package com.monocept.model.test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AppendWriteFile {

	public static void main(String[] args) throws Exception {
		String name="rohan";
		name=name+".txt";
		BufferedWriter file = new BufferedWriter(new FileWriter(name,true));
        file.write("   adding from new program \n");
        file.write("   it's appending the file hehehehe \n");
        file.close();
        System.out.println("  file append successfully");
	}
}

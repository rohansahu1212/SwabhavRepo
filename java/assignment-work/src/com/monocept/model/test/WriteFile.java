package com.monocept.model.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		String name="rohan";
		String address="548 faithful ganj";
		String change="<html>\r\n" + 
	    		" <head></head>\r\n" + 
	    		" <body >\r\n" +name +
	    		"  <div></div>\r\n" +address +
	    		" </body>\r\n" + 
	    		"</html>";

		FileWriter fw = new FileWriter("rohan.html");
		fw.write(change);
		fw.close();

	}
}
/*File file = new File("rohan.html");
BufferedReader br = new BufferedReader(new FileReader(file));
String message;
String change = "";
while ((message = br.readLine()) != null)
	change = change + message;

br.close();
change = change.replace("$body", "this is new body");
change = change.replace("$title", "this is new title");
System.out.println(change);*/
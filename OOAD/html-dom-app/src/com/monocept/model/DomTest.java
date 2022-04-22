package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DomTest {
	public static void main(String[] args) throws IOException {
		HtmlDomGroupElement root = new HtmlDomGroupElement("div");
		HtmlIndiElement txt = new HtmlIndiElement("input", "text", "Email");
		HtmlIndiElement txt2 = new HtmlIndiElement("input", "password", "password");
		HtmlIndiElement bnt = new HtmlIndiElement("input", "button", "login");
		root.addChild(txt);
		root.addChild(txt2);
		root.addChild(bnt);
	//	System.out.println(root.render());
	//	generateHtmlFile(root.render());
		generateHtml(root.render());
		
	}
	static void generateHtmlFile(String text) throws IOException {
		  FileWriter myWriter = new FileWriter("htmldom2.html");
	      myWriter.write(text);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	}
	static void generateHtml(String txt) throws IOException {
		File file = new File("htmldom1.html");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		String completeHtml="";
		while((line = br.readLine()) != null){
		    //System.out.println(line);
		   completeHtml+="\n"+line;
		}
		completeHtml= completeHtml.replace("$body",txt);
		System.out.println(completeHtml);
		generateHtmlFile(completeHtml);
		
	}
}

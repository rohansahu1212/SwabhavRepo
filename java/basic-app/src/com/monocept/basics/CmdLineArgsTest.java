package com.monocept.basics;

public class CmdLineArgsTest {
	public static void main(String studentNames[]) {

		if (studentNames.length == 0)
			System.out.println("No Value is passed");
		for (String stuName : studentNames)
			System.out.println(stuName);
	}

}

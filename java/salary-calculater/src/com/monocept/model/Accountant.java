package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Accountant extends Employee {
	private double perks;

	public Accountant(int employeeNumber, String employeeName, double basic) {
		super(employeeNumber, employeeName, basic);
		this.perks = (3 / 10.0) * basic;
		System.out.println("acc helo");

	}

	@Override
	public double calcAnnualCTC() {

		return (perks + getBasic()) * 12;
	}

	@Override
	public String getOtherSalary() {
		return ("    <td>Perkes #</td>\r\n" + "    <td>" + perks + "</td>\r\n");
	}
//	@Override
//	public void salary() throws IOException {
//		File file=new File(this.getEmployeeNumber()+"_"+getEmployeeName()+".html");
//		FileWriter fw=new FileWriter(file);
//		fw.write("<html>\r\n" + 
//				"<head>\r\n" + 
//				"<style>\r\n" + 
//				"table, th, td {\r\n" + 
//				"  border: 1px solid black;\r\n" + 
//				"  border-collapse: collapse;\r\n" + 
//				"}\r\n" + 
//				"</style>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"\r\n" + 
//				"<table>\r\n" + 
//				"  <tr>\r\n" + 
//				"    <td>Employee Name</td>\r\n" + 
//				"    <td>"+getEmployeeName()+"</td>\r\n" + 
//				"  </tr>\r\n" + 
//				"  <tr>\r\n" + 
//				"    <td>Employee Number</td>\r\n" + 
//				"    <td>"+getEmployeeNumber()+"</td>\r\n" + 
//				"  </tr>\r\n" + 
//				"  <tr>\r\n" + 
//				"    <td>Basic salary </td>\r\n" + 
//				"    <td>"+getBasic()+"</td>\r\n" + 
//				"  </tr>\r\n" + 
//				"  <tr>\r\n" + 
//				"    <td>Perks </td>\r\n" + 
//				"    <td>"+perks+"</td>\r\n" + 
//				"  </tr>\r\n" +
//				"  <tr>\r\n" + 
//				"    <td>Annual Cta</td>\r\n" + 
//				"    <td>"+calcAnnualCTC()+"</td>\r\n" + 
//				"  </tr>\r\n" +
//				"</table>\r\n" + 
//				"\r\n" + 
//				"</body>\r\n" + 
//				"</html>");
//		fw.close();
//		
//		
//	}
}

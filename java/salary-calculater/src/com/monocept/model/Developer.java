package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Developer extends Employee {
	private double pib;
	private double otb;

	public Developer(int employeeNumber, String employeeName, double basic) {
		super(employeeNumber, employeeName, basic);
		this.pib = (4.0 / 10) * basic;
		this.otb = (3.0 / 10) * basic;
		System.out.println("dev hello");
	}

	public double getPib() {
		return pib;
	}

	public double getOtb() {
		return otb;
	}

	@Override
	public double calcAnnualCTC() {

		return ((pib + otb + getBasic()) * 12);
	}

	@Override
	public String getOtherSalary() {

		return ("   <tr> <td>Performance Bonus</td>\r\n" + "    <td>" + pib + "</td></tr>\r\n"
				+ " <tr>   <td>Overtime Bonus</td>\r\n" + "    <td>" + otb + "</td></tr>\r\n");
	}
//	@Override
//	public void salary() throws IOException {
//	File file=new File(this.getEmployeeNumber()+"_"+getEmployeeName()+".html");
//	FileWriter fw=new FileWriter(file);
//	fw.write("<html>\r\n" + 
//			"<head>\r\n" + 
//			"<style>\r\n" + 
//			"table, th, td {\r\n" + 
//			"  border: 1px solid black;\r\n" + 
//			"  border-collapse: collapse;\r\n" + 
//			"}\r\n" + 
//			"</style>\r\n" + 
//			"</head>\r\n" + 
//			"<body>\r\n" + 
//			"\r\n" + 
//			"<table>\r\n" + 
//			"  <tr>\r\n" + 
//			"    <td>Employee Name</td>\r\n" + 
//			"    <td>"+getEmployeeName()+"</td>\r\n" + 
//			"  </tr>\r\n" + 
//			"  <tr>\r\n" + 
//			"    <td>Employee Number</td>\r\n" + 
//			"    <td>"+getEmployeeNumber()+"</td>\r\n" + 
//			"  </tr>\r\n" + 
//			"  <tr>\r\n" + 
//			"    <td>Basic salary </td>\r\n" + 
//			"    <td>"+getBasic()+"</td>\r\n" + 
//			"  </tr>\r\n" +
//			"  <tr>\r\n" + 
//			"    <td>Performance Bonus</td>\r\n" + 
//			"    <td>"+pib+"</td>\r\n" + 
//			"  </tr>\r\n" +
//			"  <tr>\r\n" + 
//			"    <td>Over Time Bonus </td>\r\n" + 
//			"    <td>"+otb+"</td>\r\n" + 
//			"  </tr>\r\n" +
//			"  <tr>\r\n" + 
//			"    <td>Annual Cta</td>\r\n" + 
//			"    <td>"+calcAnnualCTC()+"</td>\r\n" + 
//			"  </tr>\r\n" +
//			"</table>\r\n" + 
//			"\r\n" + 
//			"</body>\r\n" + 
//			"</html>");
//	fw.close();
//	
//		
//	}

}

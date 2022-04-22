package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

	private double hra;
	private double ta;
	private double da;

	public Manager(int employeeNumber, String employeeName, double basic) {
		super(employeeNumber, employeeName, basic);
		hra = (5.0 / 10) * basic;
		ta = (1.0 / 10) * basic;
		da = (2.0 / 10) * basic;

	}

	@Override
	public double calcAnnualCTC() {

		return ((hra + ta + da + getBasic()) * 12);
	}

	@Override
	public String getOtherSalary() {

		return ("   <tr> <td>House rent Allowance #</td>\r\n" + "    <td>" + hra + "</td></tr>\r\n"
				+ " <tr>   <td>travel Allowance</td>\r\n" + "    <td>" + ta + "</td></tr>\r\n"
				+ "  <tr>  <td>Dearness Allowance</td>\r\n" + "    <td>" + da + "</td></tr>\r\n");
	}
//	@Override
//	public void salary() throws IOException {
//		File file = new File(this.getEmployeeNumber() + "_" + getEmployeeName() + ".html");
//		FileWriter fw = new FileWriter(file);
//		fw.write("<html>\r\n" + "<head>\r\n" + "<style>\r\n" + "table, th, td {\r\n" + "  border: 1px solid black;\r\n"
//				+ "  border-collapse: collapse;\r\n" + "}\r\n" + "</style>\r\n" + "</head>\r\n" + "<body>\r\n" + "\r\n"
//				+ "<table>\r\n" + "  <tr>\r\n" + "    <td>Employee Name</td>\r\n" + "    <td>" + getEmployeeName()
//				+ "</td>\r\n" + "  </tr>\r\n" + "  <tr>\r\n" + "    <td>Employee Number</td>\r\n" + "    <td>"
//				+ getEmployeeNumber() + "</td>\r\n" + "  </tr>\r\n" + "  <tr>\r\n" + "    <td>Basic salary </td>\r\n"
//				+ "    <td>" + getBasic() + "</td>\r\n" + "  </tr>\r\n" +
//				///////////
//				"  <tr>\r\n" + "    <td>House rent Allowance </td>\r\n" + "    <td>" + hra + "</td>\r\n" + "  </tr>\r\n"
//				+
//				/////////
//				"  <tr>\r\n" + "    <td>Travel Allowance </td>\r\n" + "    <td>" + ta + "</td>\r\n" + "  </tr>\r\n" +
//				///////////
//				"  <tr>\r\n" + "    <td>Dearness Allowance</td>\r\n" + "    <td>" + da + "</td>\r\n" + "  </tr>\r\n"
//				+ "  <tr>\r\n" + "    <td>Annual Cta</td>\r\n" + "    <td>" + calcAnnualCTC() + "</td>\r\n"
//				+ "  </tr>\r\n" + "</table>\r\n" + "\r\n" + "</body>\r\n" + "</html>");
//		fw.close();
//
//	}
}

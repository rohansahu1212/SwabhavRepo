package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SalaryTest {

	public static void main(String[] args) throws IOException {
		Employee[] employees = { new Manager(101, "Rohan", 220000), new Accountant(103, "Shikhar", 200000),
				new Developer(102, "Vineet", 200000) };
		printSalarySlip(employees);

	}

	private static void printSalarySlip(Employee[] emp) throws IOException {
		for (Employee employee : emp) {
			System.out.println("---------------------------");
			System.out.println("id- " + employee.getEmployeeNumber());
			System.out.println(employee.getEmployeeName());
			System.out.println(employee.getBasic());
			System.out.println(employee.calcAnnualCTC());
			generateSalarySlip(employee);
		}
	}

	private static void generateSalarySlip(Employee emp) throws IOException {
		File file = new File(emp.getEmployeeNumber() + "_" + emp.getEmployeeName() + ".html");
		FileWriter fw = new FileWriter(file);
		fw.write("<html>\r\n" + "<head>\r\n" + "<style>\r\n" + "table, th, td {\r\n" + "  border: 1px solid black;\r\n"
				+ "  border-collapse: collapse;\r\n" + "}\r\n" + "</style>\r\n" + "</head>\r\n" + "<body>\r\n" + "\r\n"
				+ "<table>\r\n" + "  <tr>\r\n" + "    <td>Employee Name</td>\r\n" + "    <td>" + emp.getEmployeeName()
				+ "</td>\r\n" + "  </tr>\r\n" + "  <tr>\r\n" + "    <td>Employee Number</td>\r\n" + "    <td>"
				+ emp.getEmployeeNumber() + "</td>\r\n" + "  </tr>\r\n" + "  <tr>\r\n" + "    <td>Basic salary </td>\r\n"
				+ "    <td>" + emp.getBasic() + "</td>\r\n" + "  </tr>\r\n" + "  <tr>\r\n" + emp.getOtherSalary()
				+ "  <tr>\r\n" + "    <td>Annual Cta</td>\r\n" + "    <td>" + emp.calcAnnualCTC() + "</td>\r\n"
				+ "  </tr>\r\n" + "</table>\r\n" + "\r\n" + "</body>\r\n" + "</html>");
		fw.close();

	}

}

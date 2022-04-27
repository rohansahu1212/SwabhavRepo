package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionTest {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:4040/swabhav_tech?useSSL=false&serverTimezone=UTC", "root", "root");

			Scanner sc = new Scanner(System.in);
			System.out.println("enter employee id");
			String empId = sc.nextLine();
			String query = "select EMPNO, ENAME,SAL,JOB from Emp where EMPNO = " + empId + " ";

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				System.out.print("EmpNOo: " + rs.getInt("EMPNO"));
				System.out.print(", Salary: " + rs.getInt("SAL"));
				System.out.print(", Name: " + rs.getString("ENAME"));
				System.out.println(", Job: " + rs.getString("JOB"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

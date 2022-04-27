package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionSolutionTest {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:4040/swabhav_tech?useSSL=false&serverTimezone=UTC", "root", "root");

			Scanner sc = new Scanner(System.in);
			System.out.println("enter employee id solution");
			String empId = sc.nextLine();
			String query = "select EMPNO, ENAME,SAL,JOB from Emp where EMPNO =  ? ";

			PreparedStatement stmt = connection.prepareStatement(query);

			stmt.setString(1, empId);

			ResultSet rs = stmt.executeQuery();
			System.out.println(rs.getStatement());

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

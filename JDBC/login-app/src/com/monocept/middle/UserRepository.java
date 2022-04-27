package com.monocept.middle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {



	public UserData authenticate(String username,String password) {
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:4040/swabhav_tech?useSSL=false&serverTimezone=UTC", "root", "root");

			String query = "SELECT * from USERDATA WHERE USERNAME = ? AND USERPASSWORD = ? ;";

			PreparedStatement stmt = connection.prepareStatement(query);
			
			stmt.setString(1, username);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();
			System.out.println(rs.getStatement());

			while (rs.next()) {
				
				return new UserData(rs.getInt("ID"), rs.getString("USERNAME"),rs.getString("USERPASSWORD") ,rs.getString("EMAIL"), rs.getDouble("BALANCE"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}

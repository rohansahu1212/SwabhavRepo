package com.monocept.repositor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Course;
import com.monocept.model.Student;

public class CourseReopository {
	public List<Course> getCourses() {
		List<Course> courses = new ArrayList<Course>();
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohandbms?useSSL=false&serverTimezone=UTC",
					"root", "root");
			System.out.println(con.getClass());
		} catch (ClassNotFoundException e) {
			System.out.println(e + "   from class not found");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println(e1 + "   sql exception");
			e1.printStackTrace();
		}

		try {
			PreparedStatement ps = con.prepareStatement("select * from course");
			ResultSet resultSet;
			resultSet = ps.executeQuery();
			int code;

			while (resultSet.next()) {
				int id = Integer.valueOf(resultSet.getInt("courseId"));
				String cName = resultSet.getString("cName").trim();
				String duration = resultSet.getString("duration").trim();
				System.out.println("roll : " + id + "  name : " + cName + " duraation : " + duration );
				courses.add(new Course(id, cName, duration));
			}

			resultSet.close();
			ps.close();
			con.close();

		} catch (Exception e) {

		}
		return courses;
	}
}

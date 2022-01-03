package com.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class SelectDemo {

	public static void main(String[] args) throws Exception {

		
		// Step#1 Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 Established the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_camp92", "root", "root");

		// Step#3 Write SQL query
		String select = "SELECT * FROM employee";

		// Step#5 Get carrier
		PreparedStatement ps = connection.prepareStatement(select);

		// Step#5 Execute the queries
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			double salary = rs.getDouble("salary");

			System.out.println(id + ", " + name + ", " + age + ", " + salary);
		}

		// Step#6 close the resources
		rs.close();
		ps.close();
		connection.close();

	}

}
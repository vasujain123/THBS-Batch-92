package com.pro.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {

		try {

			// Step#1 Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step#2 Established the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root",
					"root");

			return connection;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
}

package com.db.employeemanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public final static String USER_NAME = "root";
	public final static String PASSWORD = "root";
	public final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final static String URI = "jdbc:mysql://localhost:3306/sample";

	// physical connection with db
	public static Connection getConnection() {
		// load driver class
		Connection connection = null;
		// get connection from getconnection method of driver manager class
		try {
			Class.forName(DRIVER_NAME);
			try {
				connection = DriverManager.getConnection(URI, USER_NAME, PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
	try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

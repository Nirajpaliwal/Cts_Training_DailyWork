package com.cts.training.jdbc.day20;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Load database driver
		// 1.1 By using forName() method

		Class.forName("com.mysql.jdbc.Driver");

		// 1.2
		// Driver driver = new com.mysql.jdbc.Driver();

		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctspune";

		Connection conn = DriverManager.getConnection(url, "root", "ROOT");
		// System.out.println("Connection Esatablished");

		// Execute sql queries
		Statement stmt = conn.createStatement();

		// String query = "insert into employee values(3,'Pulkit', 'Indore', 22,
		// 794735734)";
		String query2 = "update employee set name = 'Rahul' where id=1";
		// String query3 = "delete from employee where id=1";

		int result = stmt.executeUpdate(query2);
		if (result > 0) {
			System.out.println("Record Deleted Succesfully");
		} else {
			System.out.println("Something went wrong");
		}

		String query4 = "select * from employee";
		ResultSet rs = stmt.executeQuery(query4);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String address = rs.getString(3);
			int age = rs.getInt(4);
			long phone = rs.getLong(5);

			System.out.println(id + " " + name + " " + address + " " + age + " " + phone);
		}

	}

}

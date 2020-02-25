package com.cts.training.jdbc.day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "ROOT");

		Statement stmt = conn.createStatement();
		
		

		// String insert_query = "insert into user values(5,'kunal',18,'indore')";
		String select_query = "select * from user";
		String update_query = "update user set city = 'mumbai' where id = 2";
		String delete_query = "delete from user where id = 5";
		String alter_query = "alter table user modify name varchar(50)";

		// inserting records
//		int insert_result = stmt.executeUpdate(insert_query);
//		if (insert_result > 0) {
//			System.out.println("Record inserted Succesfully");
//		} else {
//			System.out.println("Something went wrong in insertion");
//		}

		// updating records
		int update_result = stmt.executeUpdate(update_query);
		if (update_result > 0) {
			System.out.println("Record updated Succesfully");
		} else {
			System.out.println("Something went wrong in updation");
		}

		// deleting records
//		int delete_result = stmt.executeUpdate(delete_query);
//		if (delete_result > 0) {
//			System.out.println("Record deleted Succesfully");
//		} else {
//			System.out.println("Something went wrong in deletion");
//		}

		// altering records
		int alter_result = stmt.executeUpdate(alter_query);
		if (alter_result > 0) {
			System.out.println("Record altered Succesfully");
		} else {
			System.out.println("Something went wrong in alter command");
		}

		// fetching records
		System.out.println("\n\nUser Table Details\n");
		ResultSet rs = stmt.executeQuery(select_query);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String city = rs.getString("city");

			System.out.println(id + "   " + name + "   " + age + "   " + city);
		}

	}

}

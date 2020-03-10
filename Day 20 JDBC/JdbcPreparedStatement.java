package com.cts.training.jdbc.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPreparedStatement {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		System.out.println("Enter id : ");
//		int id = Integer.parseInt(br.readLine());
//
//		System.out.println("Enter name");
//		String name = br.readLine();
//
//		System.out.println("Enter age : ");
//		int age = Integer.parseInt(br.readLine());
//
//		System.out.println("Enter city");
//		String city = br.readLine();

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "ROOT");
		
		// Sql queries
		String insert_query = "insert into user values(?,?,?,?)";
		String update_query = "update user set name = ? where id = ? ";
		String select_query = "select * from user";
		String delete_query = "delete from user where id = ? ";

//		// for insertion into table
//		PreparedStatement ps = conn.prepareStatement(insert_query);
//		ps.setInt(1, id);
//		ps.setString(2, name);
//		ps.setInt(3, age);
//		ps.setString(4, city);

		// for insertion into table
//		int insert_result = ps.executeUpdate();
//		if (insert_result > 0) {
//			System.out.println("Data inserted succesfully");
//		} else {
//			System.out.println("Something went wrong in insertion");
//		}
//		

		// for updation into table
//		PreparedStatement ps2 = conn.prepareStatement(update_query);
//		ps2.setString(1, name);
//		ps2.setInt(2, id);

//		// for updation into table
//		int update_result = ps2.executeUpdate();
//		if (update_result > 0) {
//			System.out.println("Data updated succesfully");
//		} else {
//			System.out.println("Something went wrong in updation");
//		}
//		

		// for deletion into table
//		PreparedStatement ps3 = conn.prepareStatement(delete_query);
//		ps3.setInt(1, id);
//
//		// for deletion into table
//		int delete_result = ps3.executeUpdate();
//		if (delete_result > 0) {
//			System.out.println("Data deleted succesfully");
//		} else {
//			System.out.println("Something went wrong in deletion");
//		}
//		
//		
		// for fetching data from table
		PreparedStatement ps4 = conn.prepareStatement(select_query);
		ResultSet rs = ps4.executeQuery();
		int count = 1;
		while (rs.next()) {
			System.out.println("\n------------Employee " + count + " record is------------");

			int user_id = rs.getInt("id");
			String user_name = rs.getString("name");
			int user_age = rs.getInt("age");
			String user_city = rs.getString("city");

			System.out.println("Id : " + user_id);
			System.out.println("Name : " + user_name);
			System.out.println("Age : " + user_age);
			System.out.println("City : " + user_city);

			count++;
		}

	}
}

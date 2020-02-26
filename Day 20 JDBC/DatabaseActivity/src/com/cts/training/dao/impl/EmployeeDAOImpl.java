package com.cts.training.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.employee.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

	Scanner sc = new Scanner(System.in);
	Connection conn = getConnection();
	PreparedStatement ps1 = null;
	PreparedStatement ps2 = null;
	PreparedStatement ps3 = null;
	PreparedStatement ps4 = null;

	@Override
	public boolean saveEmployee(Employee employee) {
		List<Employee> employees = new ArrayList<Employee>();
		String insert_query = "insert into employee_details values(?,?,?,?,?,?,?)";
		try {
			ps1 = conn.prepareStatement(insert_query);
			ps1.setInt(1, employee.getId());
			ps1.setString(2, employee.getName());
			ps1.setString(3, employee.getAddress());
			ps1.setString(4, employee.getDesignation());
			ps1.setInt(5, employee.getAge());
			ps1.setDouble(6, employee.getSalary());
			ps1.setInt(7, employee.getPhone());

			int insert_result = ps1.executeUpdate();
			if (insert_result > 0) {
				System.out.println("Data inserted succesfully");
			} else {
				System.out.println("Something went wrong in insertion");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(int emp_id) {
		Employee em = new Employee();
		List<Employee> employees = new ArrayList<Employee>();
		String update_name = "update employee_details set name = ? where id = ?";
		String update_city = "update employee_details set address = ? where id = ?";
		String update_age = "update employee_details set ge = ? where id = ?";
		String update_phone = "update employee_details set phone = ? where id = ?";

		try {
			ps1 = conn.prepareStatement(update_name);
			ps2 = conn.prepareStatement(update_city);
			ps3 = conn.prepareStatement(update_age);
			ps4 = conn.prepareStatement(update_phone);
			System.out.println("\nDo you want to update name ? press 1 for yes/ press 2 for no : ");

			int choice1 = sc.nextInt();
			sc.nextLine();
			if (choice1 == 1) {
				System.out.println("\nEnter new name : ");
				String new_name = sc.nextLine();

				ps1.setString(1, new_name);
				ps1.setInt(2, emp_id);
				int update_result = ps1.executeUpdate();
				if (update_result > 0) {
					System.out.println("Name updated succesfully");
				} else {
					System.out.println("Something went wrong in name updation");
				}

				// em.setName(new_name);
				// System.out.println("\nName updated succesfully...");
			}

			System.out.println("\nDo you want to update city ? press 1 for yes/ press 2 for no : ");
			int choice2 = sc.nextInt();
			sc.nextLine();
			if (choice2 == 1) {
				System.out.println("\nEnter new city : ");
				String new_city = sc.next();

				ps2.setString(1, new_city);
				ps2.setInt(2, emp_id);
				int update_result = ps2.executeUpdate();
				if (update_result > 0) {
					System.out.println("City updated succesfully");
				} else {
					System.out.println("Something went wrong in city updation");
				}
				// System.out.println("\nCity updated succesfully...");
			}

			System.out.println("\nDo you want to update age ? press 1 for yes/ press 2 for no : ");
			int choice3 = sc.nextInt();
			sc.nextLine();
			if (choice3 == 1) {
				System.out.println("\nEnter new age : ");
				int new_age = sc.nextInt();

				ps3.setInt(1, new_age);
				ps3.setInt(2, emp_id);
				int update_result = ps1.executeUpdate();
				if (update_result > 0) {
					System.out.println("Age updated succesfully");
				} else {
					System.out.println("Something went wrong in age updation");
				}

				// System.out.println("\nAge updated succesfully...");
			}

			System.out.println("\nDo you want to update mobile number ? press 1 for yes/ press 2 for no : ");
			int choice4 = sc.nextInt();
			sc.nextLine();
			if (choice4 == 1) {
				System.out.println("\nEnter new city : ");
				int new_number = sc.nextInt();

				ps4.setInt(1, new_number);
				ps4.setInt(2, emp_id);
				int update_result = ps1.executeUpdate();
				if (update_result > 0) {
					System.out.println("Phone Number updated succesfully");
				} else {
					System.out.println("Something went wrong in number updation");
				}

				// System.out.println("\nMobile number updated succesfully...");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		String delete_query = "delete from employee_details where id = ?";
		try {
			ps1 = conn.prepareStatement(delete_query);
			ps1.setInt(1, employee.getId());
			int delete_result = ps1.executeUpdate();
			
			if (delete_result > 0) {
				System.out.println("Data deleted succesfully");
			} else {
				System.out.println("Something went wrong in deletion");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		String select_query = "select * from employee_details where id = ?";
		try {
			ps1 = conn.prepareStatement(select_query);
			ps1.setInt(1, id);

			ResultSet rs = ps1.executeQuery();
			Employee emp = null;
			while (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setDesignation(rs.getString("designation"));
				emp.setAge(rs.getInt("age"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setPhone(rs.getInt("phone"));
			}
			return emp;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String select_query = "select * from employee_details";
		try {
			ps1 = conn.prepareStatement(select_query);
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setDesignation(rs.getString("designation"));
				emp.setAge(rs.getInt("age"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setPhone(rs.getInt("phone"));

				employees.add(emp);
			}
			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "ROOT");
			return conn;
		} catch (Exception e) {
			return null;
		}

	}

}

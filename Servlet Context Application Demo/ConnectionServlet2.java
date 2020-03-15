
package com.cts.training;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Connection
 */

public class ConnectionServlet2 extends HttpServlet {
	String user, password, url, driver;
	Connection conn;
	ServletContext context;

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
		user = context.getInitParameter("userName");
		password = context.getInitParameter("password");
		url = context.getInitParameter("url");
		driver = context.getInitParameter("driver");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn + " from connection servlet 1");
			System.out.println(config + "from cs2");
			System.out.println(context + "from cs2");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getMethod().equals("GET")) {
			doGet(req, resp);
		} else {
			doPost(req, resp);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String emp_id = req.getParameter("id");
		String emp_name = req.getParameter("name");
		String dept_id = req.getParameter("dept_id");
		String emp_salary = req.getParameter("salary");

		String insert_query = "insert into employee values(?,?,?,?)";

		try {
			PreparedStatement ps;
			ps = conn.prepareStatement(insert_query);
			ps.setString(1, emp_id);
			ps.setString(2, emp_name);
			ps.setString(3, dept_id);
			ps.setString(4, emp_salary);

			int insert_result = ps.executeUpdate();
			if (insert_result > 0) {
				pw.write("<h1>Employee details saved succesfully</h1>");
			} else {
				pw.write("<h1>Something went wrong</h1>");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

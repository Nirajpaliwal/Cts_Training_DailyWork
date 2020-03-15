package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class Greeting extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String UserName = req.getParameter("un");
		String pass = req.getParameter("pwd");
		String age = req.getParameter("pwd");

		
		if (UserName.equals("neeraj") && pass.equals("paliwal"))
			pw.write("<h1>Welcome " + UserName + "</h1>");
		else
			pw.write("<h1>Something went wrong </h1>");
	}
}

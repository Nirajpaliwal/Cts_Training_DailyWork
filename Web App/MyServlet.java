package com.cts.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/neerajP")
public class MyServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		
		System.out.println("From init----- it gets call only once -- always first");
		// super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From service----- it gets call multiple times");
		// super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("From destroy----- it gets call only once -- always last");
		// super.destroy();
	}

}

package com.sh.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URI "abcd" is mapped to MyServlet class.
//@WebServlet("/abcd")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// initialization
		System.out.println("init() called...");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		System.out.println("doGet() called...");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		System.out.println("doPost() called...");
	}
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet!!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	public void destroy() {
		// deinitialization
		System.out.println("destroy() called...");
	}
}

	package com.market;
	
	import java.io.*;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.*;
	
	public class LoginController extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
	
			String email = request.getParameter("email");
			String password = request.getParameter("pass");
			String signup = request.getParameter("signup");
			Customer customer = new Customer();
			customer.setEmail(email);
			customer.setPassword(password);
			request.setAttribute("customer", customer);
	
			boolean status = customer.validate();
	
			if (status) {
				RequestDispatcher rd = request.getRequestDispatcher("market.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
	
		}
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req, resp);
		}
	}

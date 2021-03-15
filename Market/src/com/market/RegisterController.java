	package com.market;
	
	import java.io.*;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.*;
	
	public class RegisterController extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html");
	
			String first_name = request.getParameter("fname");
			String last_name = request.getParameter("lname");
			String email = request.getParameter("email");
			String password1 = request.getParameter("pass1");
			String phone = request.getParameter("telnum");
			
			Customer customer = new Customer(first_name, email, last_name, phone, password1);
			
			
			request.setAttribute("customer", customer);
			
			boolean status = customer.checkMail();
	
			if (status) {
				customer.register();
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}
			
		}
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req, resp);
		}
	}

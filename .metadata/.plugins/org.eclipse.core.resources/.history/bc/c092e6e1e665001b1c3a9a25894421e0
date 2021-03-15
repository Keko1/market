package com.market;

import java.sql.*;
import javax.xml.bind.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Customer {
	String first_name;
	String email;
	String last_name;
	String phone;
	String password;

	public Customer(String first_name, String email, String last_name, String phone, String password) {
		super();
		this.first_name = first_name;
		this.email = email;
		this.last_name = last_name;
		this.phone = phone;
		this.password = password;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate(){
		String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String jdbcURL = "jdbc:sqlserver://localhost;Databasename=market;user=sa;password=123;"; 
		int i = 0;
		try {
			Class.forName(jdbcDriver).newInstance();
			Connection conn = DriverManager.getConnection(jdbcURL);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select count(*) AS COUNT from customers where email = '" + this.email +"' and password = '" + this.password + "';");
			while (rs.next()) {
				i = (int) rs.getObject(1);
			}
		} catch (Exception e){
			e.printStackTrace(System.err);
		    System.exit(0);
		}
		if (i > 0)
			return true;
		return false;
	}
}

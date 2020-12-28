package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Login;
import com.service.UserService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserService userService = new UserService();
		
		Login log = new Login(request.getParameter("uname"), 
				request.getParameter("pass"));
		

		boolean res = userService.login(log);

		if (res) {
			HttpSession session = request.getSession();
			session.setAttribute("sesname", log);
		
			response.sendRedirect("Loginsuccess.jsp");
		} else {
			response.getWriter().println("invalid credentails!!");
		}
	
	}

}

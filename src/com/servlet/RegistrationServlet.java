package com.servlet;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;



import com.model.Registration;
import com.service.UserService;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService userService = new UserService();
		System.out.println("inside servlet");
		
		Registration reg = new Registration(request.getParameter("uname"),
				request.getParameter("email"),request.getParameter("city"));
		
		Cookie cookie = new Cookie("user","admin");
		response.addCookie(cookie);
		
		boolean res = userService.registration(reg);
		
		if (res) {
			HttpSession session = request.getSession();
			session.setAttribute("sesname", reg);
		
			response.sendRedirect("registersuccess.jsp");
		} else {
			response.getWriter().println("user not registered! user already exists in Database!");
		}
		
		
		
	}
}

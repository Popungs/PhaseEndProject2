package com.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		
		
		response.getWriter().println(session.getId());
		response.getWriter().println(session.isNew()); // verify whether session is new or not
		
		
		response.getWriter().println(session.getCreationTime());
		response.getWriter().println(session.getLastAccessedTime());
		
		session.setMaxInactiveInterval(60);
	}

	

}

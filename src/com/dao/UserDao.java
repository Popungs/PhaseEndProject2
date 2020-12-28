package com.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Login;
import com.model.Registration;

public interface UserDao {
	
	public boolean registration(Registration reg);
	public boolean login(Login log,HttpServletRequest request,HttpServletResponse response);
	
	
}

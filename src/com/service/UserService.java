package com.service;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dal.HibernateUtility;
import com.dao.UserDao;
import com.model.Login;
import com.model.Registration;

public class UserService implements UserDao {

	public boolean registration(Registration reg) {

		boolean res = false;
		System.out.println("inside user service");
		
		// validation 
		String uname = reg.getUname();
		String email = reg.getEmail();
		String password = reg.getPassword();
		String city = reg.getCity(); // unpack reg object
		
		Session session = HibernateUtility.getSession();
		Query query = session.createQuery("from Registration");
		List<Registration> rl = query.list();
		// iterate over list of registered users
		for (Registration r : rl) {
			if (r.getUname().equalsIgnoreCase(uname) || r.getEmail().equals(email)) {
				System.out.println("same name / email already exists on database!");
				return false;
				// do not register the same name twice
			}
		}
		// if it reached this point there is no duplicate in the database.
		// go ahead and register
		Transaction tx = session.beginTransaction();
		
		session.save(reg);
		tx.commit();
		
		System.out.println("user is registered");
		res = true;
		return res;
	

		

	}

	@Override
	public boolean login(Login log) {
		
		System.out.println("inside login service");
		String uname = log.getUname();
		String password = log.getPassword();
		Session session = HibernateUtility.getSession();
		Query query = session.createQuery("from Registration");
		
		List<Registration> rl = query.list(); // should really be 1 in the list
		for (Registration r : rl) {
			if (r.getUname().equalsIgnoreCase(uname) && r.getPassword().equals(password)) {
				// user valid!
				System.out.println("user valid! loggin in");
				return true;
			}
		}
		
			
		
		return false;
	}

}

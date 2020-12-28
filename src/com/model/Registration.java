package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registration {
	
	@Id
	private String uname;
	private String email;
	private String password;
	private String city;

	public Registration(String uname, String email, String password, String city) {
		super();
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.city = city;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [uname=" + uname + ", email=" + email + ", password=" + password + ", city=" + city + "]";
	}

	
}

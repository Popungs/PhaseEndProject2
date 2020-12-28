package com.model;

public class Login {
	private String uname;
	private String password;
	
	public Login(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [uname=" + uname + ", password=" + password + "]";
	}

}

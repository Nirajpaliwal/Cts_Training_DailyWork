// POJO/Model/Bean

package com.cts.bean;

public class LoginBean {
	private String userName, password;

	public LoginBean() {

	}

	public String getUserName() {
		System.out.println("From getUserName()");
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("From setUserName()");
	}

	public String getPassword() {
		System.out.println("From getPassword()");
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("From setPassword()");
	}
}

package com.coderscampus.as3;

public class User {

	private String userName;
	private String password;
	private String name;
	
	public User(String username, String password, String name) {
		this.userName = username;
		this.password = password;
		this.name = name;
	}
	
	public String getUsername() {
		return userName;
	}
	
	public void setUsername(String username) {
		this.userName = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}



package com.coderscampus.as3;

public class User{
	
	private static String username;
	private static String password;
	private static String name;
	public static int length;
	
	public User(String username, String password, String name) {
		User.username = username;
		User.password = password;
		User.name = name;
	}
	
	public static String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		User.username = username;
	}
	
	public static String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		User.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		User.name = name;
	}

}



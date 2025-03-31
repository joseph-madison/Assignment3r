package com.coderscampus.as3;

import java.io.*;

public class UserService {
	private String inputUsername;
	private Object inputPassword;


	public User[] loadUserFromFile(String filePath) throws IOException {
		User[] users = new User[4];
		
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line;
		 
		 while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 3) {
	          
	            }
	        }  
	        reader.close();
	        return users;
		
	}
	


	 public User[] readUsersFromFiled() {
	        for (int i = 0; i < User.length; i++) {
	            if (User.getUsername().equalsIgnoreCase(inputUsername) &&
	                User.getPassword().equals(inputPassword)) {
	                User[] users = null;
					return users;
	            }
	        }
	        return null;
	}
	
	}



	

			

	
	
	
		


		

		
	

	            






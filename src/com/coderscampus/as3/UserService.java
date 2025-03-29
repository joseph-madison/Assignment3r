package com.coderscampus.as3;

import java.io.*;

public class UserService {
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

	public class UserArrayExample {
	    public static void main(String[] args) throws IOException {
	        UserService userService = new UserService();

	        User[] users =  (userService).readUsersFromFile();

			
			for (User user : users) {
			    System.out.println("Username: " + user.getUsername());
			    System.out.println("Password: " + user.getPassword());
			    System.out.println("Name: " + user.getName());
			    System.out.println("---------------------------");
			}
	    
	        
	    }
	}
//
	 public User readUsersFromFile(String inputUsername, String inputPassword, User[] users) {
	        for (User user : users) {
	            if (user.getUsername().equalsIgnoreCase(inputUsername) &&
	                user.getPassword().equals(inputPassword)) {
	                return user;
	            }
	        }
	        return null;
	}
	public User[] readUsersFromFile() {
		// TODO Auto-generated method stub
		return null;
	}

}

	
	
		


		

		
	

	            






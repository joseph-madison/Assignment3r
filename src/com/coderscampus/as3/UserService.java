package com.coderscampus.as3;

import java.io.*;


public class UserService {
	


	public User[] loadUserFromFile(String filePath) throws IOException {
		User[] users = new User[4];
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			while ((reader.readLine()) != null) {
				for (int i = 0; i < User.length; i++) {
					System.out.println("Enter User " +(i +1) + ":");
					System.out.println("Username: " +(i+1) + ":");
					users[i] = new User(filePath, filePath, filePath);
				}
			}
		}
			return users;
	}
}



			        
			        	
			      
			       
			  
			    

	

	            
		
	
	


	

	
	



	

			

	
	
	
		


		

		
	

	            






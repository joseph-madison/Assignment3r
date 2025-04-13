package com.coderscampus.as3;
public class UserService {


    public User createUser(String username, String password) {

        User user = new User();


        User.setUsername(username);
        User.setPassword(password);
        User.setFirstName("Test");
        User.setLastName("User");

        User.setUsername(username);
        User.setPassword(password);
        User.setFirstName("Another");
        User.setLastName("User");

        User.setUsername(username);
        User.setPassword(password);
        User.setFirstName("John");
        User.setLastName("Doe");

        User.setUsername(username);
        User.setPassword(password);
        User.setFirstName("Jane");
        User.setLastName("Doe");

        return user;
    }
}











































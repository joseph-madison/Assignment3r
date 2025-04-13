package com.coderscampus.as3;

public class User {

    private static String username;
    private static String password;

    public static String firstName;
    public static String lastName;
    private int unsuccessfulLoginAttempts;

    public User() {
    }
    public static String getUsername() {
        return username;
    }
    public static void setUsername(String username){
        User.username = getUsername();
    }
    public static String getPassword () {
        return password;
    }
    public static void setPassword(String password){
        User.password = getPassword();
    }

    public static String getFirstName () {
        return firstName;
    }

    public static void setFirstName (String firstName){
        User.firstName = firstName;
    }

    public static String getLastName () {
        return lastName;
    }

    public static void setLastName(String lastName) {
        User.lastName = lastName;
    }

    public int getUnsuccessfulLoginAttempts () {
        return unsuccessfulLoginAttempts;
    }

    public void setUnsuccessfulLoginAttempts ( int unsuccessfulLoginAttempts){
        this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
    }

}





